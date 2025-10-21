package br.edu.unipaulistana.backend.Blog.controllers;

import br.edu.unipaulistana.backend.Blog.domainmodel.User;
import br.edu.unipaulistana.backend.Blog.domainmodel.repositores.UserRepository;
import br.edu.unipaulistana.backend.Blog.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(this.userService.findAll());
    }

    //    GET http://localhost:8080/users/{id}
    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable UUID id){
        return ResponseEntity.ok(this.userService.findById(id));
    }

    //DELETE http://localshot:8080/users/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable UUID id){
        this.userService.deleteById(id);
        return ResponseEntity.notFound().build();

    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(this.userService.create(user),  HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return new ResponseEntity<>(this.userService.update(user),  HttpStatus.CREATED);
    }

    @PatchMapping
    public ResponseEntity<User> patchUser(@RequestBody User user){
        return new ResponseEntity<>(this.userService.partialUpdate(user), HttpStatus.CREATED);
    }
    // ENDPOINT PARA FIND BY EMAIL
    @GetMapping("/email")
    public Optional<User> findByEmail(@RequestParam String email){
        return userRepository.findByEmail(email);
    }
    // ENDPOINT PARA FIND BY NAME AND EMAIL
    @GetMapping("/by-name-and-email")
    public Optional<User> findByNameAndEmail(@RequestParam String name, @RequestParam String email){
        return userRepository.findByNameAndEmail(name, email);
    }
    // ENDPOINT PARA findByNameStartingWithAndNameEndingWith
    @GetMapping("/name-range")
    public Optional<User> findByUsersByNameRange(@RequestParam("start") String nameStart,@RequestParam("end") String nameEnd ){
        return userRepository.findByNameStartingWithAndNameEndingWith(nameStart,nameEnd);
    }
    // ENDPOINT PARA findByIdWithProfileAndPosts
    @GetMapping("/id-profile/{id}")
    public Optional<User> findByUserWithDetails(@PathVariable UUID id){
        return this.userRepository.findByIdWithProfileAndPosts(id);
    }
    // 6. ENDPOINT PARA findMinPostsAndNameLike
    @GetMapping("/filter")
    public List<User> filterUsers(@RequestParam int minPosts, @RequestParam String namePart){
        return userRepository.findMinPostsAndNameLike(minPosts, namePart);
    }
}
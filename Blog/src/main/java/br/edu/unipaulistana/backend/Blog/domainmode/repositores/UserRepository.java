package br.edu.unipaulistana.backend.Blog.domainmode.repositores;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    @Query ("SELECT u FROM User u WHERE u.email = :email")
    public Optional<User> findByEmail(String email);

    Optional<User> findByName(String name);
    Optional<User> findByNameAndEmail(String name, String email);
    Optional<User> findByNameStartingWithAndNameEndingWith(String name1, String name2);
}

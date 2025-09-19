package br.edu.unipaulistana.backend.Blog.domainmode.service;

import br.edu.unipaulistana.backend.Blog.domainmode.repositores.NonPersistentUserRepository;
import br.edu.unipaulistana.backend.Blog.domainmode.repositores.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final NonPersistentUserRepository  repository;

    @Override
    public List<User> findAll() {
        return this.repository.findAll();
    }

    @Override
    public User findById(UUID id){
        return this.repository.findById(id);
    }

    @Override
    public void deleteById(UUID id){
        this.repository.removeById(id);
    }
}

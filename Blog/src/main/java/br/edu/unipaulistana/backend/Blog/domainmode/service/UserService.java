package br.edu.unipaulistana.backend.Blog.domainmode.service;

import br.edu.unipaulistana.backend.Blog.domainmode.repositores.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> findAll();

    User findById(UUID id);

    void deleteById(UUID id);
}

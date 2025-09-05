package br.edu.unipaulistana.backend.Blog.domainmode.service;

import br.edu.unipaulistana.backend.Blog.domainmode.repositores.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}

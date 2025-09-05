package br.edu.unipaulistana.backend.Blog.domainmode.service;

import br.edu.unipaulistana.backend.Blog.domainmode.repositores.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAll() {
        return List.of();
    }
}

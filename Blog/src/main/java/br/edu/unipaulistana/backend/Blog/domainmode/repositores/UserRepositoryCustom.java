package br.edu.unipaulistana.backend.Blog.domainmode.repositores;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepositoryCustom {
    Optional<User> findByIdWithProfileAndPostsCriteria(UUID id);

    List<User> findByMinRolesAndNameLikeCriteria(int minRoles, String name);
}

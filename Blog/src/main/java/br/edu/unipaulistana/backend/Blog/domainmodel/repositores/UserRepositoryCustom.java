package br.edu.unipaulistana.backend.Blog.domainmodel.repositores;

import br.edu.unipaulistana.backend.Blog.domainmodel.User;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryCustom<U, U1> {
    public Optional<User> findByIdWithProfileAndPostsCriteria(java.util.UUID id);

    public List<User> findByMinRolesAndNameLikeCriteria(int minRoles, String name);
}

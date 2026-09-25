package com.hexaport.application.port.out;

import com.hexaport.domain.model.UserImplement;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryPort {
    UserImplement save(UserImplement user);
    Optional<UserImplement> findById(long id);
    Optional<UserImplement> findByEmail(String email);
    Optional<UserImplement> findByUsername (String username);
    boolean existsByEmail (String email);
    boolean existsByUsername (String username);
    boolean existsById (long id);
    List<UserImplement> findAllOrderByXpDesc();
}

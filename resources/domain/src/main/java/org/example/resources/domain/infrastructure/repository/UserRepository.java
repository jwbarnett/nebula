package org.example.resources.domain.infrastructure.repository;

import org.example.resources.domain.entity.User;
import org.example.resources.domain.entity.type.UserId;

import java.util.List;

public interface UserRepository {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(UserId userId);

}

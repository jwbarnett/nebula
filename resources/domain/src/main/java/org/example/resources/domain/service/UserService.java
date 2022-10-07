package org.example.resources.domain.service;

import org.example.resources.domain.entity.User;
import org.example.resources.domain.entity.type.UserId;
import org.example.resources.domain.infrastructure.repository.UserRepository;

import java.util.List;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User getUserById(UserId userId) {
        return userRepository.getUserById(userId);
    }

}

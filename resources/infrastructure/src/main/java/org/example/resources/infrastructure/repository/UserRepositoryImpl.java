package org.example.resources.infrastructure.repository;

import org.example.resources.domain.entity.User;
import org.example.resources.domain.entity.type.UserId;
import org.example.resources.domain.infrastructure.repository.UserRepository;
import org.example.resources.infrastructure.dao.UserInMemoryDao;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private final UserInMemoryDao userInMemoryDao;

    public UserRepositoryImpl(UserInMemoryDao userInMemoryDao) {
        this.userInMemoryDao = userInMemoryDao;
    }

    @Override
    public void saveUser(User user) {
        userInMemoryDao.saveUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userInMemoryDao.getAllUsers();
    }

    @Override
    public User getUserById(UserId userId) {
        return userInMemoryDao.getUserById(userId);
    }

}

package org.example.resources.infrastructure.dao;

import org.example.resources.domain.entity.User;
import org.example.resources.domain.entity.type.UserId;
import org.example.resources.infrastructure.dto.UserInMemoryDto;
import org.example.resources.infrastructure.dto.ResourcesDbMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInMemoryDao {

    private final Map<UserId, UserInMemoryDto> users;

    public UserInMemoryDao() {
        this.users = new HashMap<>();
    }

    public void saveUser(User user) {
        users.put(user.getUserId(), ResourcesDbMapper.INSTANCE.userInMemoryDtoFromEntity(user));
    }

    public List<User> getAllUsers() {
        return users.values().stream().map(ResourcesDbMapper.INSTANCE::userEntityFromInMemoryDto).toList();
    }

    public User getUserById(UserId userId) {
        return ResourcesDbMapper.INSTANCE.userEntityFromInMemoryDto(users.get(userId));
    }

}

package org.example.resources.infrastructure.dto;

import org.example.resources.domain.entity.type.UserId;

public class UserInMemoryDto {

    private final UserId userId;
    private final String name;

    public UserInMemoryDto(UserId userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public UserId getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

}

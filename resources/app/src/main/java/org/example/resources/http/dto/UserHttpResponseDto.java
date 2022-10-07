package org.example.resources.http.dto;

import org.example.resources.http.dto.type.UserIdHttpDto;

public class UserHttpResponseDto {

    private final UserIdHttpDto userId;
    private final String name;

    public UserHttpResponseDto(UserIdHttpDto userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public UserIdHttpDto getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

}

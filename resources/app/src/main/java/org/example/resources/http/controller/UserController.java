package org.example.resources.http.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import org.example.resources.domain.entity.type.UserId;
import org.example.resources.domain.service.UserService;
import org.example.resources.http.dto.ResourcesHttpMapper;
import org.example.resources.http.dto.UserHttpRequestDto;
import org.example.resources.http.dto.UserHttpResponseDto;

import java.util.List;
import java.util.UUID;

@Controller("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserHttpResponseDto> getAllUsers() {
        return userService.getAllUsers().stream().map(ResourcesHttpMapper.INSTANCE::userEntityToHttpResponseDto).toList();
    }

    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    public void generateUser(@Body UserHttpRequestDto userRequestDto) {
        userService.saveUser(ResourcesHttpMapper.INSTANCE.userHttpRequestDtoToEntity(userRequestDto));
    }

    @Get("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public UserHttpResponseDto getUser(UUID userId) {
        return ResourcesHttpMapper.INSTANCE.userEntityToHttpResponseDto(userService.getUserById(new UserId(userId)));
    }

}

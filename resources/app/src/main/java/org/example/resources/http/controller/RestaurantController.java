package org.example.resources.http.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import org.example.resources.domain.entity.type.RestaurantId;
import org.example.resources.domain.service.RestaurantService;
import org.example.resources.http.dto.*;

import java.util.List;
import java.util.UUID;

@Controller("/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public List<RestaurantHttpResponseDto> getAllRestaurants() {
        return restaurantService.getAllRestaurants().stream().map(ResourcesHttpMapper.INSTANCE::restaurantEntityToHttpResponseDto).toList();
    }

    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    public void generateRestaurant(@Body RestaurantHttpRequestDto restaurantRequestDto) {
        restaurantService.saveRestaurant(ResourcesHttpMapper.INSTANCE.restaurantHttpRequestDtoToEntity(restaurantRequestDto));
    }

    @Get("/{restaurantId}")
    @Produces(MediaType.APPLICATION_JSON)
    public RestaurantHttpResponseDto getRestaurant(UUID restaurantId) {
        return ResourcesHttpMapper.INSTANCE.restaurantEntityToHttpResponseDto(restaurantService.getRestaurantById(new RestaurantId(restaurantId)));
    }

}

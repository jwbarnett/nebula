package org.example.resources.http.dto;

import org.example.resources.http.dto.type.RestaurantIdHttpDto;

public class RestaurantHttpResponseDto {

    private final RestaurantIdHttpDto restaurantId;
    private final String name;

    public RestaurantHttpResponseDto(RestaurantIdHttpDto restaurantId, String name) {
        this.restaurantId = restaurantId;
        this.name = name;
    }

    public RestaurantIdHttpDto getRestaurantId() {
        return restaurantId;
    }

    public String getName() {
        return name;
    }

}

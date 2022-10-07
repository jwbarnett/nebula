package org.example.resources.infrastructure.dto;

import org.example.resources.domain.entity.type.RestaurantId;

public class RestaurantInMemoryDto {

    private final RestaurantId restaurantId;
    private final String name;

    public RestaurantInMemoryDto(RestaurantId restaurantId, String name) {
        this.restaurantId = restaurantId;
        this.name = name;
    }

    public RestaurantId getRestaurantId() {
        return restaurantId;
    }

    public String getName() {
        return name;
    }
}

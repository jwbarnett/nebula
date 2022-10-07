package org.example.resources.infrastructure.dao;

import org.example.resources.domain.entity.Restaurant;
import org.example.resources.domain.entity.type.RestaurantId;
import org.example.resources.infrastructure.dto.ResourcesDbMapper;
import org.example.resources.infrastructure.dto.RestaurantInMemoryDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantInMemoryDao {

    private final Map<RestaurantId, RestaurantInMemoryDto> restaurants;

    public RestaurantInMemoryDao() {
        this.restaurants = new HashMap<>();
    }

    public void saveRestaurant(Restaurant restaurant) {
        restaurants.put(
                restaurant.getRestaurantId(),
                ResourcesDbMapper.INSTANCE.restaurantInMemoryDtoFromEntity(restaurant));
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurants.values().stream().map(ResourcesDbMapper.INSTANCE::restaurantEntityFromInMemoryDto).toList();
    }

    public Restaurant getRestaurantById(RestaurantId restaurantId) {
        return ResourcesDbMapper.INSTANCE.restaurantEntityFromInMemoryDto(restaurants.get(restaurantId));
    }

}

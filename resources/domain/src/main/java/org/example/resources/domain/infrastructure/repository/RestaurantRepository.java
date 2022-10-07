package org.example.resources.domain.infrastructure.repository;

import org.example.resources.domain.entity.Restaurant;
import org.example.resources.domain.entity.type.RestaurantId;

import java.util.List;

public interface RestaurantRepository {

    void saveRestaurant(Restaurant restaurant);

    List<Restaurant> getAllRestaurants();

    Restaurant getRestaurantById(RestaurantId restaurantId);

}

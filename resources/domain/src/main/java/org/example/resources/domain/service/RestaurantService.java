package org.example.resources.domain.service;

import org.example.resources.domain.entity.Restaurant;
import org.example.resources.domain.entity.type.RestaurantId;
import org.example.resources.domain.infrastructure.repository.RestaurantRepository;

import java.util.List;

public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public void saveRestaurant(Restaurant restaurant) {
        restaurantRepository.saveRestaurant(restaurant);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.getAllRestaurants();
    }

    public Restaurant getRestaurantById(RestaurantId restaurantId) {
        return restaurantRepository.getRestaurantById(restaurantId);
    }

}

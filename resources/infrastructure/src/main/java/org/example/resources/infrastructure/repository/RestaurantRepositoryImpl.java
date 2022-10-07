package org.example.resources.infrastructure.repository;

import org.example.resources.domain.entity.Restaurant;
import org.example.resources.domain.entity.type.RestaurantId;
import org.example.resources.domain.infrastructure.repository.RestaurantRepository;
import org.example.resources.infrastructure.dao.RestaurantInMemoryDao;

import java.util.List;

public class RestaurantRepositoryImpl implements RestaurantRepository {

    private final RestaurantInMemoryDao restaurantInMemoryDao;

    public RestaurantRepositoryImpl(RestaurantInMemoryDao restaurantInMemoryDao) {
        this.restaurantInMemoryDao = restaurantInMemoryDao;
    }

    @Override
    public void saveRestaurant(Restaurant restaurant) {
        restaurantInMemoryDao.saveRestaurant(restaurant);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantInMemoryDao.getAllRestaurants();
    }

    @Override
    public Restaurant getRestaurantById(RestaurantId restaurantId) {
        return restaurantInMemoryDao.getRestaurantById(restaurantId);
    }

}

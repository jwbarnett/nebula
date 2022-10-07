package org.example.resources.http;

import org.example.resources.domain.infrastructure.repository.RestaurantRepository;
import org.example.resources.domain.infrastructure.repository.UserRepository;
import org.example.resources.domain.service.RestaurantService;
import org.example.resources.domain.service.UserService;
import org.example.resources.infrastructure.dao.RestaurantInMemoryDao;
import org.example.resources.infrastructure.dao.UserInMemoryDao;
import org.example.resources.infrastructure.repository.RestaurantRepositoryImpl;
import org.example.resources.infrastructure.repository.UserRepositoryImpl;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;

@Factory
public class ResourcesAppFactory {

    private final UserInMemoryDao userInMemoryDao = new UserInMemoryDao();
    private final RestaurantInMemoryDao restaurantInMemoryDao = new RestaurantInMemoryDao();

    private final UserRepository userRepository = new UserRepositoryImpl(userInMemoryDao);
    private final RestaurantRepository restaurantRepository = new RestaurantRepositoryImpl(restaurantInMemoryDao);

    @Singleton
    UserService userService() {
        return new UserService(userRepository);
    }

    @Singleton
    RestaurantService restaurantService() {
        return new RestaurantService(restaurantRepository);
    }

}

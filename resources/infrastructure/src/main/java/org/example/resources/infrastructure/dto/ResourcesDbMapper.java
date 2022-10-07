package org.example.resources.infrastructure.dto;

import org.example.resources.domain.entity.Restaurant;
import org.example.resources.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ResourcesDbMapper {

    ResourcesDbMapper INSTANCE = Mappers.getMapper(ResourcesDbMapper.class);

    UserInMemoryDto userInMemoryDtoFromEntity(User user);

    User userEntityFromInMemoryDto(UserInMemoryDto userInMemoryDto);

    RestaurantInMemoryDto restaurantInMemoryDtoFromEntity(Restaurant restaurant);

    Restaurant restaurantEntityFromInMemoryDto(RestaurantInMemoryDto restaurantInMemoryDto);

}

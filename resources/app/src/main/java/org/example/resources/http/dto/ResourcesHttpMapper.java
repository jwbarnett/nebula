package org.example.resources.http.dto;

import org.example.resources.domain.entity.Restaurant;
import org.example.resources.domain.entity.User;
import org.example.resources.domain.entity.type.RestaurantId;
import org.example.resources.domain.entity.type.UserId;
import org.example.resources.http.dto.type.RestaurantIdHttpDto;
import org.example.resources.http.dto.type.UserIdHttpDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ResourcesHttpMapper {

    ResourcesHttpMapper INSTANCE = Mappers.getMapper(ResourcesHttpMapper.class);

    @Mapping(target = "userId", expression = "java(new UserId())")
    User userHttpRequestDtoToEntity(UserHttpRequestDto userRequestDto);

    UserIdHttpDto userIdEntityToHttpResponseDto(UserId userId);

    UserHttpResponseDto userEntityToHttpResponseDto(User user);

    @Mapping(target = "restaurantId", expression = "java(new RestaurantId())")
    Restaurant restaurantHttpRequestDtoToEntity(RestaurantHttpRequestDto restaurantRequestDto);

    RestaurantIdHttpDto restaurantIdEntityToHttpResponseDto(RestaurantId restaurantId);

    RestaurantHttpResponseDto restaurantEntityToHttpResponseDto(Restaurant restaurant);

}

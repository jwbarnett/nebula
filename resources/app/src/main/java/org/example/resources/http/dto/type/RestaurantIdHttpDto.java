package org.example.resources.http.dto.type;

import com.fasterxml.jackson.annotation.JsonValue;
import org.example.resources.domain.entity.type.Default;
import org.example.resources.http.dto.RestaurantHttpResponseDto;

import java.util.UUID;

import static java.util.UUID.randomUUID;

public class RestaurantIdHttpDto {

    private final UUID UUID;

    public RestaurantIdHttpDto() {
        this.UUID = randomUUID();
    }

    @Default
    public RestaurantIdHttpDto(UUID UUID) {
        this.UUID = UUID;
    }

    public UUID getUUID() {
        return UUID;
    }

    @Override
    @JsonValue
    public String toString() {
        return UUID.toString();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof RestaurantIdHttpDto && ((RestaurantIdHttpDto)o).getUUID().equals(UUID);
    }

    @Override
    public int hashCode() {
        return UUID.hashCode();
    }

}

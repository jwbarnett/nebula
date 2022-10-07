package org.example.resources.http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestaurantHttpRequestDto {

    private final String name;

    public RestaurantHttpRequestDto(@JsonProperty("name") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

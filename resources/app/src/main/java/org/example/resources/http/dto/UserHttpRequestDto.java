package org.example.resources.http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserHttpRequestDto {

    private final String name;

    public UserHttpRequestDto(@JsonProperty("name") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

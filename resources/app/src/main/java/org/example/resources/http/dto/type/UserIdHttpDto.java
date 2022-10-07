package org.example.resources.http.dto.type;

import com.fasterxml.jackson.annotation.JsonValue;
import org.example.resources.domain.entity.type.Default;

import java.util.UUID;

import static java.util.UUID.randomUUID;

public class UserIdHttpDto {

    private final UUID UUID;

    public UserIdHttpDto() {
        this.UUID = randomUUID();
    }

    @Default
    public UserIdHttpDto(UUID UUID) {
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
        return o instanceof UserIdHttpDto && ((UserIdHttpDto)o).getUUID().equals(UUID);
    }

    @Override
    public int hashCode() {
        return UUID.hashCode();
    }

}

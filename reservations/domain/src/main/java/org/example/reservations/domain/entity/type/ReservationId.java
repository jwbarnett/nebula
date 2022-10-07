package org.example.reservations.domain.entity.type;

import java.util.UUID;

public class ReservationId {

    private final UUID uuid;

    public ReservationId() {
        this.uuid = UUID.randomUUID();
    }

    public ReservationId(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    // TODO: Override hashCode() and equals()
}

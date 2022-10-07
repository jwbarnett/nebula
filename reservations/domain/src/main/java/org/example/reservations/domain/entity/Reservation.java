package org.example.reservations.domain.entity;

import org.example.reservations.domain.entity.type.ReservationId;

public class Reservation {

    private final ReservationId reservationId;
    // private final RestaurantId restaurantId;
    // private final UserId userId;
    // private final TableId tableId;
    // private final LocalDateTime dateTime;
    // private final ReservationStatus reservationStatus
    // private final LocalDateTime createdDateTime; // Used to check if HELD reservation should be removed

    public Reservation(ReservationId reservationId) {
        this.reservationId = reservationId;
    }

    public ReservationId getReservationId() {
        return reservationId;
    }

}

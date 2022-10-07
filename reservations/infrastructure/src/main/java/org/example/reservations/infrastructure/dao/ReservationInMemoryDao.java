package org.example.reservations.infrastructure.dao;

import org.example.reservations.domain.entity.Reservation;
import org.example.reservations.domain.entity.type.ReservationId;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReservationInMemoryDao {

    private final Map<ReservationId, Reservation> reservations;

    private final Map<LocalDate, Set<Reservation>> reservationDateIndex;

    public ReservationInMemoryDao() {
        this.reservations = new HashMap<>();
        this.reservationDateIndex = new HashMap<>();
    }

}

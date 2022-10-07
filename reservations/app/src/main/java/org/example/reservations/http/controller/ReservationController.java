package org.example.reservations.http.controller;

import io.micronaut.http.annotation.Controller;

@Controller("/reservations")
public class ReservationController {

    // public getAvailableTimes(RestaurantId restaurantId, UserId userId, int partySize, LocalDate date)
    // Validate partySize (must be less than or equal to 6)
    // Validate no existing reservation for userId
    // Get restaurant - includes bookingDuration(int partySize), and numberOfTables >= partySize
    // Get all existing reservations for restaurant on date, filter for relevant tables
    // Iterate through hours of the day, tables, and reservations to generate available time slows

    // public ReservationId holdReservation(RestaurantId restaurantId, UserId userId, int partySize, LocalDateTime dateTime)
    // Validate dateTime (must be on the hour or on the half hour)
    // Get/Await reservation lock for restaurant/dateTime
    // call getAvailableTimes() to ensure still free
    // create and store reservation, status HELD
    // Release reservation lock for restaurant/dateTime

    // confirmReservation(ReservationId reservationId)
    // validate reservation with status HELD exists and still valid
    // update reservation, status CONFIRMED

    // cancelReservation(ReservationId reservationId)
    // validate reservation with status CONFIRMED exists
    // remove reservation

}

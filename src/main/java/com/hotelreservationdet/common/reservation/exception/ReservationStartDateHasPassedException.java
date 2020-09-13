package com.hotelreservationdet.common.reservation.exception;

import com.hotelreservationdet.common.exception.HotelReservationDetException;

public class ReservationStartDateHasPassedException extends HotelReservationDetException {
    public ReservationStartDateHasPassedException() {
        super("Reservation Start Date has passed");
    }

    @Override
    public String getErrorCode() {
        return "reservation_start_date_has_passed";
    }
}

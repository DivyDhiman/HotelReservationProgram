package com.hotelreservationdet.common.reservation.exception;

import com.hotelreservationdet.common.exception.HotelReservationDetException;

public class DateSpecifiedAlreadyPassedException extends HotelReservationDetException {
    public DateSpecifiedAlreadyPassedException() {
        super("Start date and end date must be in the future");
    }

    @Override
    public String getErrorCode() {
        return "date_specified_already_passed";
    }
}

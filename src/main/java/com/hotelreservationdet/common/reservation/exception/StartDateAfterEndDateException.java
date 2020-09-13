package com.hotelreservationdet.common.reservation.exception;

import com.hotelreservationdet.common.exception.HotelReservationDetException;

public class StartDateAfterEndDateException extends HotelReservationDetException {
    public StartDateAfterEndDateException() {
        super("Start date must be before end date");
    }

    @Override
    public String getErrorCode() {
        return "start_date_after_end_date";
    }
}

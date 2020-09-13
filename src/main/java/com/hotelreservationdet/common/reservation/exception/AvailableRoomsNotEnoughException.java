package com.hotelreservationdet.common.reservation.exception;

import com.hotelreservationdet.common.exception.HotelReservationDetException;

public class AvailableRoomsNotEnoughException extends HotelReservationDetException {
    public AvailableRoomsNotEnoughException() {
        super("Quantity requested is bigger than the available rooms for " +
                "the specified type ");
    }

    @Override
    public String getErrorCode() {
        return "available_rooms_not_enough";
    }
}

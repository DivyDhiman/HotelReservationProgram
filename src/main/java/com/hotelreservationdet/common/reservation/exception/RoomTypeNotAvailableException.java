package com.hotelreservationdet.common.reservation.exception;

import com.hotelreservationdet.common.exception.HotelReservationDetException;

public class RoomTypeNotAvailableException extends HotelReservationDetException {
    public RoomTypeNotAvailableException() {
        super("All the rooms with type you specified have been occupied");
    }

    @Override
    public String getErrorCode() {
        return "room_type_not_available";
    }
}

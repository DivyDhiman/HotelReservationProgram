package com.hotelreservationdet.common.exception;

public abstract class HotelReservationDetException extends RuntimeException {

    public HotelReservationDetException() {}

    public abstract String getErrorCode();

    public HotelReservationDetException(String message) {
        super(message);
    }

    public HotelReservationDetException(String message, Throwable cause) {
        super(message, cause);
    }

    public HotelReservationDetException(Throwable cause) {
        super(cause);
    }

    public HotelReservationDetException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package com.hotelreservationdet.common.exception;

import lombok.Value;

@Value
public class ErrorResponse {

    private final String error;
    private final String errorDescription;
}

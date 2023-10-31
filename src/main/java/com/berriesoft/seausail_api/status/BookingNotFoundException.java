package com.berriesoft.seausail_api.status;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.BAD_REQUEST)
public class BookingNotFoundException extends RuntimeException {
    public BookingNotFoundException(ErrorInfoList errorInfoList)
    {
        super(errorInfoList.toString());
    }
}
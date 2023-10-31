package com.berriesoft.seausail_api.status;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException
{
    public UserNotFoundException(ErrorInfoList errorInfoList)
    {
        super(errorInfoList.toString());
    }

}

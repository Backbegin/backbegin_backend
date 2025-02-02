package org.example.backsite.exception;

import org.example.backsite.exception.BaseException;
import org.example.backsite.exception.handler.ApiErrorMessages;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = ApiErrorMessages.BAD_REQUEST)
public class BadRequestException extends BaseException {

    public BadRequestException() {
        this(ApiErrorMessages.BAD_REQUEST);
    }

    public BadRequestException(String s) {
        super(s);
    }
}

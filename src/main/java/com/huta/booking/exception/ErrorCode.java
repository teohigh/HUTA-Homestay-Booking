package com.huta.booking.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Getter
@AllArgsConstructor
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(500, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR), // 500
    UNAUTHENTICATED(401, "Unauthenticated", HttpStatus.UNAUTHORIZED),                      // 401
    UNAUTHORIZED(403, "You do not have permission", HttpStatus.FORBIDDEN),                 // 403
    INVALID_KEY(400, "Uncategorized error", HttpStatus.BAD_REQUEST),                       // 400

    HOMESTAY_NOT_FOUND(404, "Homestay not found", HttpStatus.NOT_FOUND),                   // 404
    GUESTS_INVALID(400, "Guests invalid", HttpStatus.BAD_REQUEST),                         // 400
    ;

    int code;
    String message;
    HttpStatusCode statusCode;
}

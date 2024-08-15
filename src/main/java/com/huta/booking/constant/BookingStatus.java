package com.huta.booking.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Getter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public enum BookingStatus {
    DRAFT(0),   // DRAFT(0) means that the booking is not yet confirmed
    BOOKED(1),  // BOOKED(1) means that the booking is confirmed
    CANCELLED(2),
    COMPLETED(3);

    int value;
}

package com.huta.booking.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public enum AvailabilityStatus {
    AVAILABLE(0),
    HELD(1),
    BOOKED(2),
    SERVED(3);

    int value;
}

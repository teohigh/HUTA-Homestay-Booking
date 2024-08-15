package com.huta.booking.entity;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;


@RequiredArgsConstructor
@EqualsAndHashCode
public class HomestayAvailabilityId implements Serializable { // Serializable for caching: Tuần tự hóa đối tượng để lưu vào cache

    private Long homestayId;

    private LocalDate date;

}
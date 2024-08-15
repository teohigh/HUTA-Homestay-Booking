package com.huta.booking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "homestay_availability")
@IdClass(HomestayAvailabilityId.class) // Đánh dấu class này sẽ sử dụng composite key (khóa hợp thành)
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HomestayAvailability {

    @Id
    @Column(name = "homestay_id")
    private Long homestayId;

    @Id
    @Column(name = "date")
    private LocalDate date;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "status")
    private Integer status;
}
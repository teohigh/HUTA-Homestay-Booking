package com.huta.booking.service;

import com.huta.booking.dto.request.BookingRequest;
import com.huta.booking.dto.response.BookingResponse;
import com.huta.booking.repository.BookingRepository;
import com.huta.booking.repository.HomestayAvailabilityRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class BookingService {
    private static final int NIGHT_MAX = 365;

    BookingRepository bookingRepository;
    HomestayAvailabilityRepository homestayAvailabilityRepository;
    HomestayService homestayService;
    DiscountService discountService;

    @Transactional
    // Bảo đảm tính toàn vẹn dữ liệu bằng cách đảm bảo rằng tất cả các thao tác trong phương thức này đều thành công hoặc không thành công cùng một lúc
    public BookingResponse book(BookingRequest request) {
        return null;
    }
}

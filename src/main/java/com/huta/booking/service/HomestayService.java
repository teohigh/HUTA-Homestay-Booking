package com.huta.booking.service;

import com.huta.booking.constant.AvailabilityStatus;
import com.huta.booking.dto.request.HomestaySearchRequest;
import com.huta.booking.dto.response.HomestayDetailResponse;
import com.huta.booking.entity.Homestay;
import com.huta.booking.repository.HomestayRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class HomestayService {

    HomestayRepository repository;


    public Homestay getHomestayById(Long id) {
        var homestay = repository.findById(id).orElse(null);
        return homestay;
    }

    public List<HomestayDetailResponse> searchHomestays(HomestaySearchRequest request) {
        request.setStatus(AvailabilityStatus.AVAILABLE);
        return repository.searchHomestay(
                request.getStatus().getValue(),
                request.getCheckInDate(),
                request.getCheckOutDate(),
                request.getGuests()
        );
    }
}

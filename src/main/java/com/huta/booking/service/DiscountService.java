package com.huta.booking.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DiscountService {
    private static final Integer LONG_STAY = 3;
    private static final BigDecimal LONG_STAY_DISCOUNT_RATE = BigDecimal.valueOf(-0.05); // 5% discount

    // Tính giảm giá dựa trên số đêm ở homestay (nights) với hơn hoặc bằng 3 đêm sẽ được giảm 5%
    public BigDecimal getDiscountAmount(BigDecimal price, Integer nights) {
        BigDecimal discount = BigDecimal.ZERO;
        if (nights >= LONG_STAY) {
            discount = price.multiply(LONG_STAY_DISCOUNT_RATE);
        }
        return discount;
    }
}

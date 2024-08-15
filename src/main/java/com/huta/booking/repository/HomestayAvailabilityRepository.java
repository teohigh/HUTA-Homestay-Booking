package com.huta.booking.repository;

import com.huta.booking.entity.HomestayAvailability;
import com.huta.booking.entity.HomestayAvailabilityId;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomestayAvailabilityRepository extends JpaRepository<HomestayAvailability, HomestayAvailabilityId> {
    // Tìm tất cả các ngày có trạng thái là 1 (còn trống) của homestayId trong khoảng từ checkinDate đến checkoutDate
    @Query(value = """
            SELECT new HomestayAvailability(ha.homestayId, ha.date, ha.price, ha.status)
            FROM HomestayAvailability ha
            WHERE ha.homestayId = :homestayId
            AND ha.status = :status
            AND ha.date BETWEEN cast(:checkinDate as date) AND cast(:checkoutDate as date)
            """)
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    // Lock dữ liệu để tránh trường hợp 2 người cùng đặt cùng 1 ngày
    List<HomestayAvailability> findAndLockHomestayAvailability(@Param("homestayId") Long homestayId,
                                                               @Param("status") Integer status,
                                                               @Param("checkinDate") String checkinDate,
                                                               @Param("checkoutDate") String checkoutDate);
}

package com.linhnd.managerdevice.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.linhnd.managerdevice.models.database.BookingDetail;

public interface BookingDetailRepository extends JpaRepository<BookingDetail, String>, JpaSpecificationExecutor<BookingDetail> {

}
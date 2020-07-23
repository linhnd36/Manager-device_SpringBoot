package com.linhnd.managerdevice.models.database;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "booking_detail")
public class BookingDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "booking_detailId", insertable = false, nullable = false)
    private String bookingDetailid;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "booking_id", nullable = false)
    private String bookingId;

    @Column(name = "resource_id", nullable = false)
    private String resourceId;

    
}
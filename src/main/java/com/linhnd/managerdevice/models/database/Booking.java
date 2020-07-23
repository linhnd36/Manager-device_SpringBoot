package com.linhnd.managerdevice.models.database;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "booking")
public class Booking implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "booking_id", insertable = false, nullable = false)
    private String bookingId;

    @Column(name = "date_request", nullable = false)
    private Date dateRequest;

    @Column(name = "date_booking_from", nullable = false)
    private Date dateBookingFrom;

    @Column(name = "date_booking_to", nullable = false)
    private Date dateBookingTo;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "status_id", nullable = false)
    private String statusId;

    
}
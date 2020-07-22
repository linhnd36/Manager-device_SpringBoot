package com.linhnd.managerdevice.models.database;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "users")
@Data
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "email", insertable = false, nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "create_date", nullable = false)
    private Date createDate;

    @Column(name = "role_id", nullable = false)
    private String roleId;

    @Column(name = "status_id", nullable = false)
    private String statusId;


}
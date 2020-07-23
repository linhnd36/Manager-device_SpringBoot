package com.linhnd.managerdevice.models.database;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "status")
public class Status implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "status_id", insertable = false, nullable = false)
    private String statusId;

    @Column(name = "name", nullable = false)
    private String name;

    
}
package com.linhnd.managerdevice.models.database;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "role")
@Data
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "role_id", insertable = false, nullable = false)
    private String roleId;

    @Column(name = "name", nullable = false)
    private String name;

    
}
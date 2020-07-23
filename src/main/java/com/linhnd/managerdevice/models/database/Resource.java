package com.linhnd.managerdevice.models.database;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "resource")
@Data
@Entity
public class Resource implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "resource_id", insertable = false, nullable = false)
    private String resourceId;

    @Column(name = "item_name", nullable = false)
    private String itemName;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "highest_of_role", nullable = false)
    private String highestOfRole;

    @Column(name = "status_id", nullable = false)
    private String statusId;

    
}
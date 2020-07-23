package com.linhnd.managerdevice.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.linhnd.managerdevice.models.database.Status;

public interface StatusRepository extends JpaRepository<Status, String>, JpaSpecificationExecutor<Status> {

}
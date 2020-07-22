package com.linhnd.managerdevice.repositorys;

import com.linhnd.managerdevice.models.database.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface UsersRepository extends JpaRepository<Users, String>, JpaSpecificationExecutor<Users> {

    @Query("SELECT u FROM Users u WHERE u.email = :username AND u.password = :password ")
    Users getLogin(String username, String password);
}
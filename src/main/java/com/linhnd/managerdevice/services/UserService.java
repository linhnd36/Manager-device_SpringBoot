package com.linhnd.managerdevice.services;


import com.linhnd.managerdevice.models.database.Users;
import com.linhnd.managerdevice.models.rest.UserLogin;
import com.linhnd.managerdevice.models.rest.UserResponse;
import com.linhnd.managerdevice.repositorys.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {

    @Autowired
    private UsersRepository usersRepository;

    public UserResponse getLogin(UserLogin userLogin) {
        Users users = usersRepository.getLogin(userLogin.getUsername(), userLogin.getPassword());
        if (users == null)
            return null;

        return UserResponse.builder().name(users.getName()).role(users.getRoleId()).build();

    }

    public List getAll() {
        List<Users> all = usersRepository.findAll();
        return all;
    }
}

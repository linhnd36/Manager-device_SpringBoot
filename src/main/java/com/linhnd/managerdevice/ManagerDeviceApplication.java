package com.linhnd.managerdevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ManagerDeviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagerDeviceApplication.class, args);
        System.out.println("Hello");
    }

}

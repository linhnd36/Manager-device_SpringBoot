package com.linhnd.managerdevice.config;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponseList {
    private int statusCode;
    private String status;
    private List<Object> result;
}

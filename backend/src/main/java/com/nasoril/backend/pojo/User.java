package com.nasoril.backend.pojo;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class User {
    private String name;
    private String password;
}

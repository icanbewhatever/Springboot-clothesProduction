package com.nike.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;


@Data
public class UserVO {
    private String id;
    private String pw;
    private String name;
    private String phone;
    private String email;
    private Date join_date;
}




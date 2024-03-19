package com.nike.service;

import com.nike.domain.UserVO;


public interface UserService {
    public void registerUser(UserVO user);

    int checkDuplicateId(String id);

    String login(UserVO userVO);
}

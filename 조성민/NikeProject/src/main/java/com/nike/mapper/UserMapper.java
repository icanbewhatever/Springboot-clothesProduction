package com.nike.mapper;

import com.nike.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;


public interface UserMapper {
    void insertUser(UserVO user);

    int checkDuplicateId(String id);

    UserVO getUser(UserVO userVO);
}

package com.chenwei.ssmtest.dao;

import com.chenwei.ssmtest.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    int loginDao(@Param("user")User user) throws  Exception;
}

package com.chenwei.ssmtest.impl;

import com.chenwei.ssmtest.dao.UserDao;
import com.chenwei.ssmtest.model.User;
import com.chenwei.ssmtest.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginImpl implements LoginService {
    @Autowired
    UserDao userDao;
    @Override
    public int login(User user) throws Exception {
        int count = userDao.loginDao(user);
        return count;
    }
}

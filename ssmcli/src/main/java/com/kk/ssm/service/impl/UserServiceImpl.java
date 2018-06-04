package com.kk.ssm.service.impl;

import com.kk.ssm.dao.IUserDao;
import com.kk.ssm.model.User;
import com.kk.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}
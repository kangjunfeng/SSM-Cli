package com.kk.ssm.dao;

import com.kk.ssm.model.User;

public interface IUserDao {

    User selectUser(long id);

}
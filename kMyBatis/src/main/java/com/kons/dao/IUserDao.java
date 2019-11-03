package com.kons.dao;

import com.kons.bean.User;

public interface IUserDao {
    User findUserById(int id);
}

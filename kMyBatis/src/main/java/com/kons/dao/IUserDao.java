package com.kons.dao;


import com.kons.bean.User;

import java.util.List;

public interface IUserDao {
    List<User> findUserById(List<Integer> ids);
}

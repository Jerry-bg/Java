package com.kons.dao.impl;

import com.kons.App;
import com.kons.bean.User;
import com.kons.dao.IUserDao;
import org.apache.ibatis.session.SqlSession;

public class UserDaoImpl implements IUserDao {
    @Override
    public User findUserById(int id) {
        User user;
        try (SqlSession sqlSession= App.getSqlSession()){
            user =sqlSession.selectOne("findUserById",1);
        }
        return user;
    }
}

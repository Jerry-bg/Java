package com.kons.services;

import com.kons.beans.User;
import com.kons.dao.IUserDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserService extends SqlSessionDaoSupport {
    private IUserDao userDao;

    public void init(){
        SqlSession sqlSession=this.getSqlSession();
        userDao=(IUserDao)sqlSession.getMapper(IUserDao.class);
    }

    public User obtainUserById(int id) {
        return userDao.findUserById(id);
    }

    public void addUser(User user){
        userDao.addUser(user);
    }
}

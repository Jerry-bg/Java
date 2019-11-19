package wow.kons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wow.kons.bean.User;
import wow.kons.dao.UserDao;

@Service
public class TestService {

    @Autowired
    private UserDao userDao;

    public User obtainUser(int id){
        return userDao.findUserById(id);
    }
}

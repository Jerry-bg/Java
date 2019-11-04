package com.kons;

import com.kons.bean.User;
import com.kons.dao.IUserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.BasicConfigurator;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{

    private static String mybatisConfig="mybatis-config.xml";

    public static void main( String[] args ) throws Exception {

        BasicConfigurator.configure();

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);

        try (SqlSession sqlSession=App.getSqlSession()){
            IUserDao userDao=sqlSession.getMapper(IUserDao.class);
            List<User> users=userDao.findUserById(list);

            for (User u:users){
                System.out.println(u.getPerson_name());
            }
        }
    }


    private static volatile SqlSessionFactory sqlSessionFactory;

    public static SqlSession getSqlSession(){
        try{
            if(sqlSessionFactory==null) {
                Reader config = Resources.getResourceAsReader(mybatisConfig);
                synchronized (App.class) {
                    if(sqlSessionFactory==null)
                        sqlSessionFactory=new SqlSessionFactoryBuilder().build(config);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return sqlSessionFactory.openSession();
    }
}

package com.kons;

import com.kons.bean.User;
import com.kons.dao.impl.UserDaoImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.BasicConfigurator;

import java.io.Reader;

/**
 * Hello world!
 *
 */
public class App
{

    private static String mybatisConfig="mybatis-config.xml";

    public static void main( String[] args ) throws Exception {

        BasicConfigurator.configure();

        UserDaoImpl userDao=new UserDaoImpl();
        User user = userDao.findUserById(1);
        System.out.println(user.getPerson_name());
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

package com.kons;

import com.kons.dao.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws Exception {

        String resource= "mybatis-config.xml";
        Reader config= Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(config);
        try(SqlSession session=sqlSessionFactory.openSession()){
            User user=session.selectOne("findUserById",1);
            session.commit();
            System.out.println(user.getPerson_name());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}

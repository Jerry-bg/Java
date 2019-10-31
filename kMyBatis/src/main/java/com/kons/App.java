package com.kons;

import com.kons.dao.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.io.Reader;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args ) throws Exception {

        BasicConfigurator.configure();

        String resource= "mybatis-config.xml";
        Reader config= Resources.getResourceAsReader(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(config);
        try(SqlSession session=sqlSessionFactory.openSession()){
            User user=session.selectOne("findUserById",1);
            session.commit();
            System.out.println("This is Sql result--->"+user.getPerson_name());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}

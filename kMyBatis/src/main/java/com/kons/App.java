package com.kons;

import com.kons.bean.*;
import com.kons.dao.IDepartmentDao;
import com.kons.dao.IEmployeDao;
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

        try (SqlSession sqlSession=App.getSqlSession()){

            IDepartmentDao departmentDao=sqlSession.getMapper(IDepartmentDao.class);
            IEmployeDao employeDao=sqlSession.getMapper(IEmployeDao.class);

            //查询员工以及归属（鉴别器的使用）
            OEmployeInfo person = (OEmployeInfo) employeDao.findPersonByCode("P000003");

            //mybatis一对多查询测试
            Department department=departmentDao.findEmployeesByDepart("DP003");
            Employe employee=departmentDao.findEmployInfo("E000001");

            System.out.println(employee.toString());

            for (Employe employe:department.getEmployes()){
                System.out.println(employe.toString());
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

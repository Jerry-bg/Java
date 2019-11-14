package com;

import com.kons.beans.User;
import com.kons.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-mybatis.xml");

        UserService userService=(UserService)context.getBean("userService");
        User user=userService.obtainUserById(1);
        User tom=new User();
        tom.setId(10);
        tom.setPerson_name("kxb");
        tom.setPerson_account("975324");
        tom.setPerson_age(24);
        tom.setPerson_pwd("****");
        tom.setPerson_addr("China");

        userService.addUser(tom);
        System.out.println(user.getPerson_name());
    }

}

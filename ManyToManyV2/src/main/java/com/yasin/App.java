package com.yasin;

/**
 * Created by yasintulumen on 18/07/2017.
 */
import com.yasin.dao.*;
import com.yasin.model.Roles;
import com.yasin.model.User;
import com.yasin.model.UserRoles;
import com.yasin.usr.RolesManager;
import com.yasin.usr.UserManager;
import com.yasin.usr.UserRolesManager;
import com.yasin.usr.impl.RolesManagerImpl;
import com.yasin.usr.impl.UserManagerImpl;
import com.yasin.usr.impl.UserRolesManagerImpl;
import com.yasin.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class App {

    public static void main(String[] args){

        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring.xml");

        UserManager userManager = (UserManager) ctx.getBean("userManagerImpl");
        RolesManager rolesManager = (RolesManager) ctx.getBean("rolesManagerImpl");
        UserRolesManager userRolesManager = (UserRolesManager) ctx.getBean("userRolesManagerImpl");












/*        Date createDate1 = new Date(1994,04,02),
            updateDate1 = new Date(2006, 2, 6),
            createDate2 = new Date(1993,02,23),
            updateDate2 = new Date(2010, 4, 13),
            createDate3 = new Date(1973,03,23),
            updateDate3 = new Date(2001, 12, 31);

        User user1 = new User("yasinT", createDate1, updateDate1),
                user2 = new User("sarenT", createDate2, updateDate2),
                user3 = new User("mehmT", createDate3, updateDate3);

        Roles role1 = new Roles("Parent", createDate1, updateDate3),
                role2 = new Roles("Child", updateDate1, updateDate2 );*/
/*
        List<User> user= userManager.findAllUsers();
        List<Roles> roles = rolesManager.findAllRoles();

        UserRoles userRoles1 = new UserRoles(user.get(0), roles.get(1)),
                userRoles2 = new UserRoles(user.get(1), roles.get(1)),
                userRoles3 = new UserRoles(user.get(2), roles.get(0));*/


/*        userManager.insertUser(user1);
        userManager.insertUser(user2);
        userManager.insertUser(user3);*/

/*        rolesManager.insertRole(role1);
        rolesManager.insertRole(role2);*/

/*        userRolesManager.relative(userRoles1);
        userRolesManager.relative(userRoles2);
        userRolesManager.relative(userRoles3);*/
/*
        System.out.println(userManager.findAllUsers().toString());
        System.out.println(rolesManager.findAllRoles().toString());
        System.out.println(userRolesManager.findAllUserRoles().toString());*/
        /*System.out.println("User count: " + list.size());
        User user = new User();
        user.setName("Yasint");
        user.setCreate(createDate);
        user.setUpdate(updateDate);
        userManager.insertUser(user);
        System.out.println("User inserted!");
        list = userManager.findAllUsers();
        System.out.println("User count: " + list.size());
        System.out.println(list.toString());



        User delUser = userManager.findUserbyID(2);
        userManager.deleteUser(delUser);
        System.out.println("User deleted!");
        list = userManager.findAllUsers();
        System.out.println("User count: " + list.size());
        System.out.println(list.toString());

        user.setName("John Doe");
        user.setCreate(createDate);
        user.setUpdate(updateDate);
        userManager.deleteUser(user);
        list = userManager.findAllUsers();
        System.out.println("User count: " + list.size());


        List<Roles> list2 = rolesManager.findAllRoles();
        System.out.println("Role count: " + list2.size());
        Roles roles = new Roles();
        roles.setRole_name("manager");
        roles.setCreate_date(updateDate);
        roles.setUpdate_date(createDate);
        rolesManager.insertRole(roles);
        System.out.println("Role inserted!");
        list2 = rolesManager.findAllRoles();
        System.out.println("Roles count: " + list.size());
        System.out.println(list.toString());*/







        System.out.println("Hibernate many to many (Annotation)");


    }



}

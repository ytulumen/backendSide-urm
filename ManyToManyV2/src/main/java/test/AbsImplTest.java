package test;

import com.yasin.config.WebConfig;
import com.yasin.model.Roles;
import com.yasin.model.User;
import com.yasin.model.UserRoles;
import com.yasin.usr.RolesManager;
import com.yasin.usr.UserManager;
import com.yasin.usr.UserRolesManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import java.text.ParseException;
import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {WebConfig.class})
public class AbsImplTest {

    @Autowired
    RolesManager rolesManager;

    @Autowired
    UserManager userManager;

    @Autowired
    UserRolesManager userRolesManager;


    @Test
    public void testFindAllUsers(){
        assertNotNull(userManager.findAll());

    }
    @Test
    public void testInsertUser() throws ParseException {
        User user = new User();
        user.setPassword("passwd");
        user.setName("user");
        userManager.insert(user);
        assertNotNull(userManager.findbyName("user"));
    }
    @Test
    public void testFindByUserName(){
        assertNotNull(userManager.findbyName("abbas"));

    }
    @Test
    public void testDeleteUser(){
        userManager.delete(userManager.findbyID(5));
        assertNull(userManager.findbyID(5));
    }
    @Test
    public void testFindByIDUser(){
        assertNotNull(userManager.findbyID(1));
    }
    @Test
    public void testEditUser(){
        User currentUser = userManager.findbyID(2);
        currentUser.setName("testtt");
        currentUser.setCreate(null);
        currentUser.setUpdate(null);
        currentUser.setPassword("testtt");
        userManager.edit(currentUser);
        assertNotNull(userManager.findbyName("testtt"));
    }

    @Test
    public void testInsertRole() throws ParseException{
        Roles roles = new Roles();
        roles.setName("testRole");
        rolesManager.insert(roles);
        assertNotNull(rolesManager.findbyName("testRole"));
    }
    @Test
    public void testDeleteRole(){
        rolesManager.delete(rolesManager.findbyID(5));
        assertNull(rolesManager.findbyID(5));
    }
    @Test
    public  void testFindByIDRole(){
        assertNotNull(rolesManager.findbyID(1));
    }
    @Test
    public void findAllRole(){
        assertNotNull(rolesManager.findAll());
    }
    @Test
    public void editRole(){
        Roles roles = rolesManager.findbyID(2);
        roles.setName("testt");
        roles.setCreate(null);
        roles.setUpdate(null);
        rolesManager.edit(roles);
        assertNotNull(rolesManager.findbyName("testt"));
    }
    @Test
    public void testFindByRoleName(){
        assertNotNull(rolesManager.findbyName("ROLE_USER"));
    }

    @Test
    public void testInsertUserRoles() throws ParseException{
        UserRoles userRoles = new UserRoles();
        userRoles.setName("testUserRole");
        userRolesManager.insert(userRoles);
        assertNotNull(userRolesManager.findbyName("testUserRole"));
    }
    @Test
    public void testDeleteUserRoles(){
        userRolesManager.delete(userRolesManager.findbyID(5));
        assertNull(userRolesManager.findbyID(5));
    }
    @Test
    public  void testFindByIDUserRoles(){
        assertNotNull(userRolesManager.findbyID(1));
    }
    @Test
    public void findAllUserRoles(){
        assertNotNull(userRolesManager.findAll());
    }
    @Test
    public void editUserRoles(){
        UserRoles userRoles = userRolesManager.findbyID(2);
        userRoles.setName("testt");
        userRoles.setCreate(null);
        userRoles.setUpdate(null);
        userRolesManager.edit(userRoles);
        assertNotNull(userRolesManager.findbyName("testt"));
    }
    @Test
    public void testFindByUserRoleName(){
        assertNotNull(userRolesManager.findbyName("ABBUSR"));
    }







}

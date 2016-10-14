package demo1.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import demo1.model.User;

/**
 * Created by SHENG on 2016/10/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:Spring-mybatis.xml")
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void getUser() throws Exception {
        User user = new User();
        user.setUserName("wang");
        user.setPassword("pwd");
        System.out.println(userDao.getUser(user));
    }

    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setUserName("wang");
        user.setPassword("pwd");
        userDao.addUser(user);
    }

    @Test
    public void updateUser() throws Exception {
        User user = new User();
        user.setPassword("pwd1");
        user.setUserName("wang");
        user.setId(1);
        userDao.updateUser(user);
    }

    @Test
    public void deleteUser() throws Exception {
        int id = 1;
        userDao.deleteUser(id);
    }

    @Test
    public void batchInsertTest() {
        List<User> list = new ArrayList<User>();
        User user = new User();
        list.add(user);
        user.setPassword("pwd1");
        user.setUserName("wang1");
        user.setId(2);
        user = new User();
        list.add(user);
        user.setPassword("pwd2");
        user.setUserName("wang2");
        user.setId(3);

        userDao.batchInsert(list);

    }

}
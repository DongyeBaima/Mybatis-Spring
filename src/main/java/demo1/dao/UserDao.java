package demo1.dao;

import java.util.List;

import demo1.model.User;

/**
 * ���� : dao
 * ��Ȩ : Copyright-(c) 2016
 * ��˾ : Thinkive
 *
 * @author ���ӿ�
 * @version 2016-10-13 17:40
 */
public interface UserDao {
    User getUser(User user);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int userId);

    int batchInsert(List<User> list);
}

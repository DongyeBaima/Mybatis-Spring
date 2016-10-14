package demo1.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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


    /**
     * �������װ��Map
     */
    int insert(Map<String, Object> map);

    /**
     * ����� ����list
     */
    int insertMutiParam(@Param("data") List<User> list, String s);
}

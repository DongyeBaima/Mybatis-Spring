package demo1.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

import demo1.model.User;

/**
 * 描述 : dao
 * 版权 : Copyright-(c) 2016
 * 公司 : Thinkive
 *
 * @author 王嵊俊
 * @version 2016-10-13 17:40
 */
public interface UserDao {
    User getUser(User user);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int userId);

    int batchInsert(List<User> list);


    /**
     * 多参数封装成Map
     */
    int insert(Map<String, Object> map);

    /**
     * 多参数 包含list
     */
    int insertMutiParam(@Param("data") List<User> list, String s);
}

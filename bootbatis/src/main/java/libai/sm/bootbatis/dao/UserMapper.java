package libai.sm.bootbatis.dao;

import libai.sm.bootbatis.model.User;


import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    List<User> listAllUser();
}
package libai.sm.bootbatis.Service.ServiceImp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import libai.sm.bootbatis.Service.UserService;
import libai.sm.bootbatis.dao.UserMapper;
import libai.sm.bootbatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImp implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User getUser(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<User> listAllUser(int pageNum, int pageSize) {
        List<User> list= userMapper.listAllUser();
        PageHelper.startPage(pageNum,pageSize);
        PageInfo result=new PageInfo(list);
        return  result;
    }
}

package libai.sm.bootbatis.Service;



import com.github.pagehelper.PageInfo;
import libai.sm.bootbatis.model.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(User user);

    User getUser(int id);

   PageInfo<User> listAllUser(int pageNum,int pageSize);

}

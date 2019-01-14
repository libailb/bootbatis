package libai.sm.bootbatis.Controller;


import com.github.pagehelper.PageInfo;
import libai.sm.bootbatis.Service.UserService;
import libai.sm.bootbatis.model.Msg;
import libai.sm.bootbatis.model.User;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping(value = "add")
    public Msg addUser(User user){
        int count=userService.addUser(user);
        if(count==0){
            return Msg.fail();
        }else{
            return Msg.success().add("添加用户",user);
        }
    }

    @PostMapping(value = "list")
    public Msg listUser(@RequestParam(name = "pageNum",required = false,defaultValue = "1")int pageNum,
                        @RequestParam(name = "pageSize", required = false,defaultValue = "5" )int pageSize){
        PageInfo<User> pageInfo=userService.listAllUser(pageNum,pageSize);

        return Msg.success().add("用户当前页",pageInfo);
    }

    @PostMapping(value = "delete")
    public Msg deleteUser(int id){
        int count=userService.deleteUser(id);
        if(count==0){
            return Msg.fail();
        }else{
            return Msg.success();
        }
    }


    @PostMapping(value = "update")
    public Msg updateUser(User user){
        int count=userService.updateUser(user);
        if(count==0){
            return Msg.fail();
        }else{
            return Msg.success().add("更新用户",user);
        }
    }

    @PostMapping(value = "get")
    public Msg getUser(int id){
        User user=userService.getUser(id);
        if(user ==null){
            return Msg.fail();
        }else{
            return Msg.success().add("查询用户",user);
        }
    }

}

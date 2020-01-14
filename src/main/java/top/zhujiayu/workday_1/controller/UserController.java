package top.zhujiayu.workday_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.zhujiayu.workday_1.mapper.UserMapper;
import top.zhujiayu.workday_1.model.User;

import java.util.List;

@Controller
public class UserController {
    private UserMapper userMapper;

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = userMapper.getAll();
        return users;
    }


}

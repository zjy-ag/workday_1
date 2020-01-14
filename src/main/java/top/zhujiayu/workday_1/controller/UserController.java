package top.zhujiayu.workday_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.zhujiayu.workday_1.enums.UserSexEnum;
import top.zhujiayu.workday_1.mapper.UserMapper;
import top.zhujiayu.workday_1.model.User;

import java.util.List;

@RestController
//@Respondbody + @Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = userMapper.getAll();
        return users;
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id) {
        User user = userMapper.getOne(id);
        return user;
    }

    @PutMapping("/update")
    public void update() {
        User user = new User(32L, "zz", "78787878", UserSexEnum.MAN, "neo");
        userMapper.update(user);
    }

    @PutMapping("/add")
    public void add(){
        User user = new User(13L, "mm", "78787878", UserSexEnum.MAN, null);
        userMapper.insert(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        userMapper.delete(id);
    }



}

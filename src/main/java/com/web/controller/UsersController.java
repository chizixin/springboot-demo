package com.web.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.web.common.Test;
import com.web.entity.Users;
import com.web.mapper.IUsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zx
 * @since 2018-08-10
 */
@RestController
public class UsersController {

    //注入user数据库mapper对象
    //用来调用方法进行增删改查
    @Resource
    private IUsersMapper usersMapper;

    @GetMapping("/test")
	public  String test(){
        Test test = new Test();
        test.setName("zhangsan");
        return "test";
    }

    @GetMapping("/list")
    public List<Users> getuserlist(){
        List<Users> users = usersMapper.selectList(new EntityWrapper<Users>());
        return users;
    }
}

package com.zjj.jpa.controller;

import com.netflix.discovery.converters.Auto;
import com.zjj.jpa.entity.*;
import com.zjj.jpa.repository.UserRepository;
import com.zjj.jpa.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "没有什么意义",tags = {"用户","管理"}
)
@RestController
@RequestMapping("user")
@Slf4j
@CrossOrigin
public class UserController {

    @Autowired
    UserRepository userRep;

    @Autowired
    UserService userService;

    @RequestMapping("test")
    public String test(){
        return "test";
    }

    @RequestMapping("testaa")
    public String testAdd(){
        User user = new User();
        user.setUsername("mytest");
        userRep.save(user);
        return "ok";
    }

    @ApiOperation(value = "获取用户列表",notes = "获取用户列表，用户列表的信息主要包含。。。。",
            response=MyPageImpl.class,httpMethod="GET")
    @RequestMapping("list")
    @ApiResponse(code = 200,message="返回的MyPageImpl对象",response=MyPageImpl.class)
    public MyPageImpl<User> list(@ApiParam(name="userVo",value = "UserVo的对象",defaultValue = "")
                                 @RequestBody UserVo userVo){
        System.out.print(" 服务提供者  参数是  " + userVo);

        MyPageImpl<User> userPage = userService.list(userVo);
        log.info(" 已经获取数据了。。。。。。。。。。。。");
        userPage.getContent().iterator().forEachRemaining(x->{System.out.println("x is " + x);});
        log.info("page.class is " + userPage.getClass());
        return userPage;
    }

    @RequestMapping("del")
    public boolean del(@RequestParam(value = "id") int id){
        PhysicalNamingStrategyStandardImpl t;
        return userService.del(id);


    }

    @RequestMapping("add")
    public boolean add(@RequestBody User user){
        return userService.add(user);
    }


    @RequestMapping("departs")
    public List<Depart> getDeparts(){
        return  userService.listDeparts();
    }

    /**
     * 获取所有的爱好
     * @return
     */
    @RequestMapping("favourites")
    public List<Favourite> getFavourites(){
        return  userService.listFavourites();
    }







}

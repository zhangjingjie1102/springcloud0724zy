package com.zjj.jpa.service.impl;

import com.zjj.jpa.entity.*;
import com.zjj.jpa.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceFailBack  implements  UserService{

    @Override
    public MyPageImpl<User> list(@RequestBody UserVo userVo) {
        System.out.println(" 对不起，熔断了。。。。");
        return  null;
    }

    @Override
    public Boolean del(int id) {
        return false;
    }

    @Override
    public boolean add(User user) {
        return false;
    }

    @Override
    public List<Depart> listDeparts() {
        return new ArrayList<Depart>();
    }

    @Override
    public List<Favourite> listFavourites() {
        return new ArrayList<Favourite>();
    }
}

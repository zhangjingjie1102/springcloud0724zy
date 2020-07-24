package com.zjj.jpa.service;

import com.zjj.jpa.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;

public interface UserService {

    MyPageImpl list(UserVo userVo);

    boolean del(int id);

    boolean add(User user);

    // 获取部门的列表
    List<Depart> listDeparts();

    List<Favourite> listFavourites();
}

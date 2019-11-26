package cn.itcase.service;

import cn.itcase.pojo.PageBean;
import cn.itcase.pojo.User;

import java.util.List;

public interface UserService {

    //查询所有用户
    PageBean<User> findAll(Integer currentPage,Integer pageSize);
}

package cn.itcase.mapper;

import cn.itcase.pojo.User;

import java.util.List;

public interface UserMapper {

    //查询所有
    List<User> findAll();
}

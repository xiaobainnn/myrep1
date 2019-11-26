package cn.itcase.service.impl;

import cn.itcase.mapper.UserMapper;
import cn.itcase.pojo.PageBean;
import cn.itcase.pojo.User;
import cn.itcase.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper mapper;

    public PageBean<User> findAll(Integer currentPage, Integer pageSize) {
        //设置分页参数
        PageHelper.startPage(currentPage,pageSize);
        //设置分页
        Page<User> page = (Page<User>) mapper.findAll();

        PageBean<User> pageBean = new PageBean<User>();
        pageBean.setCurrentPage(page.getPageNum());
        pageBean.setPageSize(page.getPageSize());
        pageBean.setTotalCount(Long.valueOf(page.getTotal()).intValue());
        pageBean.setTotalPage(page.getPages());
        pageBean.setList(page.getResult());

        return pageBean;
    }
}

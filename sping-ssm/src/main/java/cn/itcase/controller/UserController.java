package cn.itcase.controller;

import cn.itcase.pojo.PageBean;
import cn.itcase.pojo.User;
import cn.itcase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")

    public String findAll(Model model,Integer currentPage,Integer pageSize){

        PageBean<User> pageBean = (PageBean<User>) userService.findAll(currentPage,pageSize);
        model.addAttribute("pageBean",pageBean);

        return "list";
    }
}

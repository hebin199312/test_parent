package com.hb.controller;

import com.hb.model.Users;
import com.hb.service.UsersService;
import com.hb.service.impl.UsersServiceimpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
@RestController
public class UsersController {
    public UsersController() {
       System.out.print("=======================================ok");
    }

    UsersService service=new UsersServiceimpl();

    @RequestMapping("/findAll")
    public List<Users> findAll(){
       return service.findAll();
    }
}

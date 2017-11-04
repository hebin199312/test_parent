package com.hb.service.impl;

import com.hb.mapper.UsersMapper;
import com.hb.mapper.impl.UsersMapperImpl;
import com.hb.model.Users;
import com.hb.service.UsersService;

import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public class UsersServiceimpl implements UsersService {

    @Override
    public List<Users> findAll() {
        UsersMapper dao=new UsersMapperImpl();
        return dao.findAll();
    }
}

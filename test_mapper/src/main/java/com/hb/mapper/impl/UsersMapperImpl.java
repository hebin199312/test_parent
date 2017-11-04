package com.hb.mapper.impl;

import com.hb.mapper.UsersMapper;
import com.hb.model.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
public class UsersMapperImpl implements UsersMapper{

    @Override
    public List<Users> findAll() {
        List<Users> list=new ArrayList<>();
        for (int i=0;i<=5;i++){
            Users user=new Users();
            user.setUid(i);
            user.setUname("hb"+i);
            list.add(user);
        }
        return list;
    }
}

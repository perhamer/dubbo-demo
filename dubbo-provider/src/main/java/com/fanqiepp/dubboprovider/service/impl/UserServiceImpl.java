package com.fanqiepp.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fanqiepp.dubboapi.domain.User;
import com.fanqiepp.dubboapi.service.UserService;
import com.fanqiepp.dubboprovider.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : sunzhaol@fanqiepinpin.com
 * @date : 2019-08-14 17:07
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findUser(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public int updateUser(User user) {
        userMapper.updateById(user);
        return 0;
    }

    @Override
    public int deleteUser(int userId) {
        userMapper.deleteById(userId);
        return 0;
    }

    @Override
    public int addUser(User user) {
        int i=userMapper.insert(user);
        return i;

    }

}

package com.fanqiepp.dubboapi.service;

import com.fanqiepp.dubboapi.domain.User;

/**
 * @author : sunzhaol@fanqiepinpin.com
 * @date : 2019-08-14 17:01
 **/
public interface UserService  {

    User findUser(int Id);

    int updateUser(User user);

    int deleteUser(int userId);

    int addUser(User user);
}

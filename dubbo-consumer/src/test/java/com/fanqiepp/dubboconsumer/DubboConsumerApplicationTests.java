package com.fanqiepp.dubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fanqiepp.dubboapi.domain.User;
import com.fanqiepp.dubboapi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboConsumerApplication.class)
public class DubboConsumerApplicationTests {

    @Reference(check = false)
    UserService userService;

    //增
    @Test
    public void addUser() {
        User user=new User();
        user.setUserName("myName2");
        user.setUserPassword("test2");
        userService.addUser(user);
    }
    //查
    @Test
    public void findUser() {
        User user = userService.findUser(1);
        System.out.println(user);
    }
    //改
    @Test
    public void updateUser() {
        User user = new User();
        user.setId(1);
        user.setUserName("testUpdate");
        userService.updateUser(user);
    }
    //删
    @Test
    public void deleteUser() {
       userService.deleteUser(1);
    }

}

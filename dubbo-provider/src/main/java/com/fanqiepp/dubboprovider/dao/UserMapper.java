package com.fanqiepp.dubboprovider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fanqiepp.dubboapi.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : sunzhaol@fanqiepinpin.com
 * @date : 2019-08-14 17:39
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}

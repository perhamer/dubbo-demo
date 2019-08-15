package com.fanqiepp.dubboapi.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author : sunzhaol@fanqiepinpin.com
 * @date : 2019-08-14 17:04
 **/
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    Integer id;

    String userName;

    String userPassword;
}

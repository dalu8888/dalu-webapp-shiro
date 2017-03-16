package com.digitalchina.sport.order.api.dao;

import com.digitalchina.sport.order.api.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by asus on 2017/3/16.
 */
@Mapper
public interface UserDao {

    List<User> getAllUser();

    User getUserById(String id);

    User getUserByUsername(String username);

}

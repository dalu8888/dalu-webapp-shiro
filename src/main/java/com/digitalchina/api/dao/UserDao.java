package com.digitalchina.api.dao;

import com.digitalchina.api.model.User;
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

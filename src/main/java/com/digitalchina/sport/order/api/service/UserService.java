package com.digitalchina.sport.order.api.service;


import com.digitalchina.sport.order.api.dao.UserDao;
import com.digitalchina.sport.order.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by root on 16-11-21.
 * Transactional:optionally support for @Transactional
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

//    @Transactional(readOnly = true)
    @Transactional(transactionManager = "")
    public User getUserById(String id) {
        return userDao.getUserById(id);
    }

    public User getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }


    /**
     * test@Transactional
     *
     * @return
     */
    @Transactional(rollbackFor = Throwable.class)
    public void testTransactional() {
//        insertUser();
//        updateUsre();
//        ....
    }
}

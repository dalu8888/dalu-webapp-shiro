package com.digitalchina.api.controller;

import com.digitalchina.api.model.User;
import com.digitalchina.api.service.UserService;
import com.digitalchina.common.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root on 16-11-21.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="getAllUser",method = RequestMethod.GET)
    @ResponseBody
    public String getAllUser() {
        List<User> user = userService.getAllUser();
        Map<String,Object> reqMap=new HashMap<String, Object>();
        reqMap.put("users",user);
        return Result.ok(reqMap);
    }


}

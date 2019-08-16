package com.keven.mit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.keven.mit.generator.tables.pojos.User;
import com.keven.mit.service.IUserService;

/**
 * Rest example
 *
 * @author keven
 * @date 2019-08-15
 */
@RestController
@RequestMapping("/api/user")
public class UserRestController {
    
    @Autowired
    private IUserService userService;

    /**
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public User add(@RequestBody User user) {
        userService.create(user);
        return user;
    }

    /**
     * delete user by id
     * 
     * @param user_id
     */
    @RequestMapping(value = "/delete/{user_id}", method = RequestMethod.GET)
    public void delete(@PathVariable("user_id") String user_id) {
        userService.delete(user_id);
    }

    /**
     * update user
     * 
     * @param user
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public User edit(@RequestBody User user) {
        userService.update(user);
        return user;
    }

    /**
     * get user by id
     * 
     * @param user_id
     * @return
     */
    @RequestMapping(value = "/view/{user_id}", method = RequestMethod.GET)
    public User view(@PathVariable("user_id") String user_id) {
        return userService.retrieve(user_id);
    }

}
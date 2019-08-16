package com.keven.mit.service;

import java.util.List;
import java.util.Map;

import com.keven.mit.generator.tables.pojos.User;

/**
 * 接口实例
 * 
 * @author keven
 * @date 2019-08-15
 */
public interface IUserService {

    /**
     * 创建用户
     * 
     * @param user
     */
    void create(User user);

    /**
     * 根据id删除用户
     * 
     * @param user_id
     */
    void delete(String user_id);

    /**
     * 更新用户
     * 
     * @param user
     */
    void update(User user);
    
    /**
     * 根据id获取用户
     * 
     * @param user_id
     * @return
     */
    User retrieve(String user_id);

    /**
     * 根据条件获取用户列表
     * 
     * @param params
     * @return
     */
    List<User> queryForList(Map<String, Object> params);
}
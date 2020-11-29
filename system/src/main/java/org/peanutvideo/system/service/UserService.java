package org.peanutvideo.system.service;

import org.peanutvideo.system.domain.User;

import java.util.List;

public interface UserService {
    /** 根据用户 userId 查询密码 **/
    public User selectByUserId(Long userId);
    /** 查询用户集 **/
    public List<User> selectUserList(User user);
    /** 删除用户 **/
    public int deleteUser(Long userId);
    /** 更新用户 **/
    public int updateUser(User user);
    /** 添加新用户 **/
    public int insertUser(User user);
}

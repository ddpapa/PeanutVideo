package org.peanutvideo.system.service;

import org.peanutvideo.system.domain.UserMessage;

import java.util.List;

public interface UserMsgService {
    /** 根据用户 userId 查询信息 **/
    public UserMessage selectByUserId(Long id);
    /** 查询用户信息集 **/
    public List<UserMessage> selectUserMessageList(UserMessage userMessage);
    /** 删除用户信息 **/
    public int deleteUserMessage(Long id);
    /** 更新用户信息 **/
    public int updateUserMessage(UserMessage userMessage);
    /** 添加新用户信息 **/
    public int insertUserMessage(UserMessage userMessage);
}

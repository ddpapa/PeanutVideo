package org.peanutvideo.system.service.impl;

import org.peanutvideo.system.domain.UserMessage;
import org.peanutvideo.system.mapper.UserMessageMapper;
import org.peanutvideo.system.service.UserMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMsgServiceImpl implements UserMsgService{
    @Autowired
    private UserMessageMapper userMessageMapper;

    @Override
    public UserMessage selectByUserId(Long id) {
        return userMessageMapper.selectUserMessage(id);
    }

    @Override
    public List<UserMessage> selectUserMessageList(UserMessage userMessage) {
        return userMessageMapper.selectUserMessageList(userMessage);
    }

    @Override
    public int deleteUserMessage(Long id) {
        return userMessageMapper.deleteUserMessage(id);
    }

    @Override
    public int updateUserMessage(UserMessage userMessage) {
        return userMessageMapper.updateUserMessage(userMessage);
    }

    @Override
    public int insertUserMessage(UserMessage userMessage) {
        return userMessageMapper.insertUserMessage(userMessage);
    }
}

package org.peanutvideo.system.mapper;

import org.peanutvideo.system.domain.UserMessage;

import java.util.List;

public interface UserMessageMapper {
    int deleteUserMessage(Long id);

    int insertUserMessage(UserMessage userMessage);

    UserMessage selectUserMessage(Long id);

    List<UserMessage> selectUserMessageList(UserMessage userMessage);

    int updateUserMessage(UserMessage userMessage);
}
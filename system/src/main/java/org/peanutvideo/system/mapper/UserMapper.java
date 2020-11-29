package org.peanutvideo.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.peanutvideo.system.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserMapper {
    int deleteUser(Long user_id);

    int insertUser(User user);

    User selectUser(Long user_id);

    List<User> selectUserList(User user);

    int updateUser(User user);
}
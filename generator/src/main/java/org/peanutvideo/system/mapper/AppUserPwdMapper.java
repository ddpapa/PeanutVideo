package org.peanutvideo.system.mapper;

import org.peanutvideo.system.domain.AppUserPwd;

public interface AppUserPwdMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppUserPwd record);

    int insertSelective(AppUserPwd record);

    AppUserPwd selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppUserPwd record);

    int updateByPrimaryKey(AppUserPwd record);
}
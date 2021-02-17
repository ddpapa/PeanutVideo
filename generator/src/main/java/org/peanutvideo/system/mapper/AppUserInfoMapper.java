package org.peanutvideo.system.mapper;

import org.peanutvideo.system.domain.AppUserInfo;

public interface AppUserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppUserInfo record);

    int insertSelective(AppUserInfo record);

    AppUserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppUserInfo record);

    int updateByPrimaryKey(AppUserInfo record);
}
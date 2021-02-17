package org.peanutvideo.system.mapper;

import org.peanutvideo.system.domain.AppUser;

public interface AppUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppUser record);

    int insertSelective(AppUser record);

    AppUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppUser record);

    int updateByPrimaryKey(AppUser record);
}
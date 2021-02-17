package org.peanutvideo.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.peanutvideo.system.domain.AppUserInfo;
import org.peanutvideo.system.domain.AppUserPwd;

import java.util.List;

@Mapper
public interface AppUserInfoMapper {
    int deleteAppUserInfo(Integer id);

    int insertAppUserInfo(AppUserInfo appUserInfo);

    AppUserInfo selectAppUserInfoById(Integer id);

    AppUserInfo selectAppUserInfo(AppUserInfo appUserInfo);

    List<AppUserInfo> selectAppUserInfoList(AppUserInfo appUserInfo);

    int updateAppUserInfo(AppUserInfo appUserInfo);
}
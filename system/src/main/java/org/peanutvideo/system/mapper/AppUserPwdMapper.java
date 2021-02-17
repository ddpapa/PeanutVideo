package org.peanutvideo.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.peanutvideo.system.domain.AppUser;
import org.peanutvideo.system.domain.AppUserPwd;

@Mapper
public interface AppUserPwdMapper {
    int deleteAppUserPwd(Integer id);

    int insertAppUserPwd(AppUserPwd appUserPwd);

    AppUserPwd selectAppUserPwdByUserId(Integer id);

    AppUserPwd selectAppUserPwd(AppUserPwd appUserPwd);

    int updateAppUserPwd(AppUserPwd appUserPwd);
}
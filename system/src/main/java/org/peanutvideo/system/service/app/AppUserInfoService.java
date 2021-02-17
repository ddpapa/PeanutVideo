package org.peanutvideo.system.service.app;

import org.peanutvideo.system.domain.AppUser;
import org.peanutvideo.system.domain.AppUserInfo;

import java.util.List;

public interface AppUserInfoService {
    /**
     *
     * @param id
     * @return
     */
    public AppUserInfo selectAppUserInfoById(Integer id);

    /**
     *
     * @param appUserInfo
     * @return
     */
    public AppUserInfo selectAppUserInfo(AppUserInfo appUserInfo);

    /**
     *
     * @param appUserInfo
     * @return
     */
    public List<AppUserInfo> selectAppUserInfoList(AppUserInfo appUserInfo);

    /**
     *
     * @param id
     * @return
     */
    public int deleteAppUserInfo(Integer id);

    /**
     *
     * @param appUserInfo
     * @return
     */
    public int updateAppUserInfo(AppUserInfo appUserInfo);

    /**
     *
     * @param appUserInfo
     * @return
     */
    public int insertAppUserInfo(AppUserInfo appUserInfo);
}

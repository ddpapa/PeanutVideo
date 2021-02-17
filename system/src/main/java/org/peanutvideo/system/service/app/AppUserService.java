package org.peanutvideo.system.service.app;

import org.peanutvideo.system.domain.AppUser;

import java.util.List;

public interface AppUserService {
    /**
     *
     * @param id
     * @return
     */
    public AppUser selectAppUserById(Integer id);

    /**
     *
     * @param appUser
     * @return
     */
    public List<AppUser> selectAppUserList(AppUser appUser);

    /**
     *
     * @param appUser
     * @return
     */
    public AppUser selectAppUser(AppUser appUser);

    /**
     *
     * @param appUser
     * @return 符合条件的AppUser个数
     */
    public int selectAppUserCounter(AppUser appUser);

    /**
     *
     * @param id
     * @return
     */
    public int deleteAppUser(Integer id);

    /**
     *
     * @param appUser
     * @return
     */
    public int updateAppUser(AppUser appUser);

    /**
     *
     * @param appUser
     * @return
     */
    public int insertAppUser(AppUser appUser);

    /**
     * 验证用户是否注册
     * @param appUser
     * @return 0表示未注册，非0表示已注册或者已经绑定手机号
     */
    public int isAppUserRegister(AppUser appUser);

    /**
     *
     * @param appUser
     * @return 用户的 id
     */
    public int appUserLoginOrRegister(AppUser appUser);
}

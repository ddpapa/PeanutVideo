package org.peanutvideo.system.service.app;

import org.peanutvideo.system.domain.AppUserPwd;

public interface AppUserPwdService {
    /** 根据用户 userId 查询密码 **/
    public AppUserPwd selectAppUserPwdById(Integer id);
    public AppUserPwd selectAppUserPwd(AppUserPwd appUserPwd);
    /** 删除用户 **/
    public int deleteAppUserPwd(Integer id);
    /** 更新用户 **/
    public int updateAppUserPwd(AppUserPwd appUserPwd);
    /** 添加新用户 **/
    public int insertAppUserPwd(AppUserPwd appUserPwd);
}

package org.peanutvideo.system.service.app.impl;

import org.peanutvideo.system.domain.AppUserPwd;
import org.peanutvideo.system.mapper.AppUserPwdMapper;
import org.peanutvideo.system.service.app.AppUserPwdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserPwdServiceImpl implements AppUserPwdService {
    @Autowired
    AppUserPwdMapper appUserPwdMapper;

    @Override
    public AppUserPwd selectAppUserPwdById(Integer id) {
        return appUserPwdMapper.selectAppUserPwdByUserId(id);
    }

    @Override
    public AppUserPwd selectAppUserPwd(AppUserPwd appUserPwd) {
        return appUserPwdMapper.selectAppUserPwd(appUserPwd);
    }

    @Override
    public int deleteAppUserPwd(Integer id) {
        return appUserPwdMapper.deleteAppUserPwd(id);
    }

    @Override
    public int updateAppUserPwd(AppUserPwd appUserPwd) {
        return appUserPwdMapper.updateAppUserPwd(appUserPwd);
    }

    @Override
    public int insertAppUserPwd(AppUserPwd appUserPwd) {
        return appUserPwdMapper.insertAppUserPwd(appUserPwd);
    }
}

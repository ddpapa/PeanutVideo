package org.peanutvideo.system.service.app.impl;

import org.peanutvideo.system.domain.AppUserInfo;
import org.peanutvideo.system.mapper.AppUserInfoMapper;
import org.peanutvideo.system.service.app.AppUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserInfoServiceImpl implements AppUserInfoService {
    @Autowired
    AppUserInfoMapper appUserInfoMapper;

    @Override
    public AppUserInfo selectAppUserInfoById(Integer id) {
        return appUserInfoMapper.selectAppUserInfoById(id);
    }

    @Override
    public AppUserInfo selectAppUserInfo(AppUserInfo appUserInfo) {
        return appUserInfoMapper.selectAppUserInfo(appUserInfo);
    }

    @Override
    public List<AppUserInfo> selectAppUserInfoList(AppUserInfo appUserInfo) {
        return appUserInfoMapper.selectAppUserInfoList(appUserInfo);
    }

    @Override
    public int deleteAppUserInfo(Integer id) {
        return appUserInfoMapper.deleteAppUserInfo(id);
    }

    @Override
    public int updateAppUserInfo(AppUserInfo appUserInfo) {
        return appUserInfoMapper.updateAppUserInfo(appUserInfo);
    }

    @Override
    public int insertAppUserInfo(AppUserInfo appUserInfo) {
        return appUserInfoMapper.insertAppUserInfo(appUserInfo);
    }
}

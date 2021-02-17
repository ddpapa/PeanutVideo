package org.peanutvideo.system.service.app.impl;

import org.peanutvideo.system.domain.AppUser;
import org.peanutvideo.system.domain.AppUserInfo;
import org.peanutvideo.system.mapper.AppUserInfoMapper;
import org.peanutvideo.system.mapper.AppUserMapper;
import org.peanutvideo.system.service.app.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {
    @Autowired
    AppUserMapper appUserMapper;

    @Autowired
    AppUserInfoMapper appUserInfoMapper;


    @Override
    public AppUser selectAppUserById(Integer id) {
        return appUserMapper.selectAppUserById(id);
    }

    @Override
    public List<AppUser> selectAppUserList(AppUser appUser) {
        return appUserMapper.selectAppUserList(appUser);
    }

    @Override
    public AppUser selectAppUser(AppUser appUser) {
        return appUserMapper.selectAppUser(appUser);
    }

    @Override
    public int selectAppUserCounter(AppUser appUser) {

        return appUserMapper.selectAppUserCounter(appUser);
    }

    @Override
    public int deleteAppUser(Integer id) {
        return appUserMapper.deleteAppUser(id);
    }

    @Override
    public int updateAppUser(AppUser appUser) {
        return appUserMapper.updateAppUser(appUser);
    }

    @Override
    public int insertAppUser(AppUser appUser) {
        return appUserMapper.insertAppUser(appUser);
    }

    @Override
    public int isAppUserRegister(AppUser appUser) {
        AppUser query = new AppUser();
        switch (appUser.getRegisterType()){
            case "0" : query.setTelephone(appUser.getTelephone());break;
            case "1" : query.setQq(appUser.getQq());break;
            case "2" : query.setWechat(appUser.getWechat());break;
            default : return -1;
        }
        query.setValid("0");
        int row = appUserMapper.selectAppUserCounter(query);
        return row;
    }

    @Override
    public int appUserLoginOrRegister(AppUser appUser) {
        int row = isAppUserRegister(appUser);
        if (row == 0){
            // 1、用户未注册
            appUserMapper.insertAppUser(appUser);
            AppUser result = appUserMapper.selectAppUser(appUser);
            AppUserInfo appUserInfo = new AppUserInfo();
            appUserInfo.setUserId(result.getId());
            appUserInfo.setNickname("花生逗趣用户");
            System.out.println(appUserInfo);
            // 2、新建一个用户信息
            appUserInfoMapper.insertAppUserInfo(appUserInfo);
            return result.getId();
        } else {
            // 3、用户已注册，查询用户id
            AppUser result = appUserMapper.selectAppUser(appUser);
            return result.getId();
        }
    }
}

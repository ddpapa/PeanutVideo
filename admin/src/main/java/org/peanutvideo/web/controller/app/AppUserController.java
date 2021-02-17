package org.peanutvideo.web.controller.app;

import org.peanutvideo.system.domain.AppUser;
import org.peanutvideo.system.domain.AppUserPwd;
import org.peanutvideo.system.service.app.AppUserPwdService;
import org.peanutvideo.system.service.app.AppUserService;
import org.peanutvideo.util.AjaxResult;
import org.peanutvideo.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author ddpapa
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class AppUserController {
    @Autowired
    HttpSession httpSession;
    @Autowired
    AppUserService appUserService;
    @Autowired
    AppUserPwdService appUserPwdService;

    @PostMapping("/login/code")
    public AjaxResult loginByCode(@RequestParam("user") String user, @RequestParam("code") String code) {
        // 1、收到验证码进行校验
        String sessionCode = (String) httpSession.getAttribute(user);
        if (StringUtils.equals(code, sessionCode)) {
            // 2、校验成功，查询用户是否注册
            AppUser appUser = new AppUser();
            appUser.setTelephone(user);
            appUser.setRegisterType("0");
            return AjaxResult.success(appUserService.appUserLoginOrRegister(appUser));
        } else {
            // 3、校验失败，可能原因：session过期和验证码错误
            return AjaxResult.error(401, "验证码错误或失效");
        }
    }

    @PostMapping("/login/password")
    public AjaxResult loginByPwd(@RequestParam("user") String user, @RequestParam("pwd") String pwd){
        AppUser appUser = new AppUser();
        appUser.setTelephone(user);
        appUser.setRegisterType("0");
        int row  = appUserService.isAppUserRegister(appUser);
        if (row == 0){
            // 1、用户未注册
            return AjaxResult.error("用户未注册");
        }else{
            AppUser result = appUserService.selectAppUser(appUser);
            AppUserPwd appUserPwd = new AppUserPwd();
            appUserPwd.setUserId(result.getId());
            AppUserPwd appUserPwdResult = appUserPwdService.selectAppUserPwd(appUserPwd);
            if (StringUtils.equals(pwd,appUserPwdResult.getPwd())){
                return AjaxResult.success();
            }
            return AjaxResult.error("密码错误");
        }
    }
}

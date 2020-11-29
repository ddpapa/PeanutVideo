package org.peanutvideo.controller.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.security.MD5Encoder;
import org.peanutvideo.system.domain.UserMessage;
import org.peanutvideo.system.service.UserMsgService;
import org.peanutvideo.system.service.UserService;
import org.peanutvideo.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ddpapa
 * @date 2020/11/19 18:53
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户登录注册接口", tags = "用户信息controller")
public class UserLogin {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMsgService userMsgService;
    /**
     *
     * 登录方式：0-手机号登录  1-微信登录  2-QQ登录
     */
    @ApiOperation(value = "用户手机号登录", notes = "登录方式0")
    @PostMapping("/byTelNumber")
    public AjaxResult LoginByTelNumber(@RequestBody UserMessage userMessage) {
        // 0、系统生成验证码，模拟收到
        // 1、查询数据库中有没有，以该手机号的联系方式
        List<UserMessage> userMessageList = userMsgService.selectUserMessageList(userMessage);
        if (userMessageList.size() == 0){
            //该用户没有注册，故需要注册；此时为手机号注册，密码不强制要求
            userMessage.setMethod(0);
            userMsgService.insertUserMessage(userMessage);
            return AjaxResult.success(userMessage);
        }
        // 2、如果没有该手机号，则通过该手机号注册
        return AjaxResult.success(userMessageList);
    }
}

package org.peanutvideo.web.controller.common;

import org.peanutvideo.util.AjaxResult;
import org.peanutvideo.util.PINGenerator;
import org.peanutvideo.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("coding")
public class PINCoding {
    @Autowired
    HttpSession httpSession;

    @PostMapping("/send")
    public AjaxResult getCode(@RequestParam String user){
        String code = PINGenerator.getCode();
        System.out.println(user);
        System.out.println(code);
        httpSession.setAttribute(user,code);
        // 设置60秒后session过期
        httpSession.setMaxInactiveInterval(60);
        return AjaxResult.success(code);
    }
}

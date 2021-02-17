package org.peanutvideo.system.domain;

/**
* 用户密码表	app_user_pwd
*
* @author ddpapa
* @date 2021/02/16
*/
public class AppUserPwd {
    /** 自增id */
    private Integer id;

    /** 用户id */
    private Integer userId;

    /** 用户密码 */
    private String pwd;

    /** 有效标志：0-有效 1-无效 */
    private String valid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }
}
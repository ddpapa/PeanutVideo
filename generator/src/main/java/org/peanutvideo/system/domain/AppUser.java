package org.peanutvideo.system.domain;

/**
* 用户表	app_user
*
* @author ddpapa
* @date 2021/02/16
*/
public class AppUser {
    /** 自增主键 */
    private Integer id;

    /** 手机号码 */
    private String telephone;

    /** QQ号码 */
    private String qq;

    /** 微信号码 */
    private String wechat;

    /** 账户类型：0-手机号 1-QQ号 2-微信号 */
    private String registerType;

    /** 用户状态：0-正常 1-封禁 */
    private String status;

    /** 有效标记：0-有效 1-无效 */
    private String valid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType == null ? null : registerType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }
}
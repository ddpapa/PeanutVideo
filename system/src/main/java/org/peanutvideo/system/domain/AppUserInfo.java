package org.peanutvideo.system.domain;

import java.util.Date;

/**
* 用户信息表	app_user_info
*
* @author ddpapa
* @date 2021/02/08
*/
public class AppUserInfo {
    /** 自增主键 */
    private Integer id;

    /** 用户id */
    private Integer userId;

    /** 用户头像 */
    private String profile;

    /** 用户昵称 */
    private String nickname;

    /** 性别：0-女 1-男 */
    private String gender;

    /** 生日 */
    private Date birthday;

    /** 所在地 */
    private String location;

    /** 个人简介 */
    private String description;

    /** 封面图片 */
    private String coverImage;

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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "AppUserInfo{" +
                "id=" + id +
                ", userId=" + userId +
                ", profile='" + profile + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", coverImage='" + coverImage + '\'' +
                ", valid='" + valid + '\'' +
                '}';
    }
}
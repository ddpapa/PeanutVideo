package org.peanutvideo.system.domain;

public class VideoInfo extends Video{
    /** 用户头像 */
    private String uprofile;

    /** 用户昵称 */
    private String nickname;

    public String getUprofile() {
        return uprofile;
    }

    public void setUprofile(String uprofile) {
        this.uprofile = uprofile;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return super.toString()+"AppVideo{" +
                "uprofile='" + uprofile + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}

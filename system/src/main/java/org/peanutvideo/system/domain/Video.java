package org.peanutvideo.system.domain;

/**
* 视频信息表	video
*
* @author ddpapa
* @date 2021/02/16
*/
public class Video {
    /** 自增id */
    private Integer id;

    /** 视频发布人id */
    private Integer userId;

    /** 背景音乐id */
    private Integer musicId;

    /** 话题id（可能有多个话题） */
    private Integer topicId;

    /** 评论id */
    private Integer discussId;

    /** 视频简介 */
    private String description;

    /** 播放地址 */
    private String videoUrl;

    /** 封面地址 */
    private String coverUrl;

    /** 视频的播放状态：0-公开 1-私密 */
    private String status;

    /** 有效标志：0-待审核 1-已发布 2-已删除 */
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

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Integer discussId) {
        this.discussId = discussId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", userId=" + userId +
                ", musicId=" + musicId +
                ", topicId=" + topicId +
                ", discussId=" + discussId +
                ", description='" + description + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", coverUrl='" + coverUrl + '\'' +
                ", status='" + status + '\'' +
                ", valid='" + valid + '\'' +
                '}';
    }
}
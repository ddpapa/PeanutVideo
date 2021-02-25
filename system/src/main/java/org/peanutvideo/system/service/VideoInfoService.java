package org.peanutvideo.system.service;

import org.peanutvideo.system.domain.Video;
import org.peanutvideo.system.domain.VideoInfo;

import java.util.List;

public interface VideoInfoService {
    /**
     * 根据video的id查询数据
     * @param id
     * @return
     */
    public VideoInfo selectVideoInfoById(Integer id);

    /**
     * 查询符合条件的video集合
     * @param VideoInfo
     * @return
     */
    public List<VideoInfo> selectVideoInfoList(VideoInfo videoInfo);
}

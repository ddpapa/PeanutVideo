package org.peanutvideo.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.peanutvideo.system.domain.Video;
import org.peanutvideo.system.domain.VideoInfo;

import java.util.List;

@Mapper
public interface VideoInfoMapper {

    /**
     * 根据video的id查询数据
     * @param id
     * @return
     */
    VideoInfo selectVideoInfoById(Integer id);

    /**
     * 查询符合条件的video集合
     * @param video
     * @return
     */
    List<VideoInfo> selectVideoInfoList(VideoInfo videoInfo);
}
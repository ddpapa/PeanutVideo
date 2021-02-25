package org.peanutvideo.system.service.impl;

import org.peanutvideo.system.domain.Video;
import org.peanutvideo.system.domain.VideoInfo;
import org.peanutvideo.system.mapper.VideoInfoMapper;
import org.peanutvideo.system.service.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoInfoServiceImpl implements VideoInfoService {
    @Autowired
    VideoInfoMapper videoInfoMapper;
    @Override
    public VideoInfo selectVideoInfoById(Integer id) {
        return videoInfoMapper.selectVideoInfoById(id);
    }

    @Override
    public List<VideoInfo> selectVideoInfoList(VideoInfo videoInfo) {
        return videoInfoMapper.selectVideoInfoList(videoInfo);
    }
}

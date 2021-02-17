package org.peanutvideo.system.service.impl;

import org.peanutvideo.system.domain.Video;
import org.peanutvideo.system.mapper.VideoMapper;
import org.peanutvideo.system.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    VideoMapper videoMapper;

    @Override
    public int deleteVideo(Integer id) {
        return videoMapper.deleteVideo(id);
    }

    @Override
    public int insertVideo(Video video) {
        return videoMapper.insertVideo(video);
    }

    @Override
    public Video selectVideoById(Integer id) {
        return videoMapper.selectVideoById(id);
    }

    @Override
    public List<Video> selectVideoList(Video video) {
        return videoMapper.selectVideoList(video);
    }

    @Override
    public int updateVideo(Video video) {
        return videoMapper.updateVideo(video);
    }
}

package org.peanutvideo.system.service;

import org.peanutvideo.system.domain.Video;

import java.util.List;

public interface VideoService {
    /**
     * 根据video的id删除数据
     * @param id
     * @return row
     */
    public int deleteVideo(Integer id);

    /**
     * 新增video数据
     * @param video
     * @return
     */
    public int insertVideo(Video video);

    /**
     * 根据video的id查询数据
     * @param id
     * @return
     */
    public Video selectVideoById(Integer id);

    /**
     * 查询符合条件的video集合
     * @param video
     * @return
     */
    public List<Video> selectVideoList(Video video);

    /**
     * 根据条件更新video
     * @param video
     * @return
     */
    public int updateVideo(Video video);
}

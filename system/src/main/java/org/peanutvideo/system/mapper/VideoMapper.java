package org.peanutvideo.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.peanutvideo.system.domain.AppUserPwd;
import org.peanutvideo.system.domain.Video;

import java.util.List;

@Mapper
public interface VideoMapper {
    /**
     * 根据video的id删除数据
     * @param id
     * @return row
     */
    int deleteVideo(Integer id);

    /**
     * 新增video数据
     * @param video
     * @return
     */
    int insertVideo(Video video);

    /**
     * 根据video的id查询数据
     * @param id
     * @return
     */
    Video selectVideoById(Integer id);

    /**
     * 查询符合条件的video集合
     * @param video
     * @return
     */
    List<Video> selectVideoList(Video video);

    /**
     * 根据条件更新video
     * @param video
     * @return
     */
    int updateVideo(Video video);
}
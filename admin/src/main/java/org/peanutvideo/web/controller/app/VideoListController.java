package org.peanutvideo.web.controller.app;

import com.github.pagehelper.PageHelper;
import org.peanutvideo.controller.BaseController;
import org.peanutvideo.system.domain.Video;
import org.peanutvideo.system.domain.VideoInfo;
import org.peanutvideo.system.service.VideoInfoService;
import org.peanutvideo.system.service.VideoService;
import org.peanutvideo.util.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoListController extends BaseController {
    @Autowired
    VideoInfoService videoInfoService;

    @GetMapping("/showAll")
    public TableDataInfo getVideo(@RequestParam("page")int page){
        VideoInfo videoInfo = new VideoInfo();
        PageHelper.startPage(page, PAGESIZE);
        List<VideoInfo> list = videoInfoService.selectVideoInfoList(videoInfo);
        return getTableInfo(list);
    }
}

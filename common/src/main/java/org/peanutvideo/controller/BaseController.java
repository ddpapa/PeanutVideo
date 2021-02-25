package org.peanutvideo.controller;

import com.github.pagehelper.PageInfo;
import org.peanutvideo.constant.HttpStatus;
import org.peanutvideo.util.TableDataInfo;

import java.util.List;

public class BaseController {
    protected final int PAGESIZE = 5;
    protected TableDataInfo getTableInfo(List<?> list){
        TableDataInfo tableDataInfo = new TableDataInfo();
        tableDataInfo.setCode(HttpStatus.SUCCESS);
        tableDataInfo.setMsg("获取分页数据成功");
        tableDataInfo.setRows(list);
        tableDataInfo.setTotal(new PageInfo(list).getPages());
        return tableDataInfo;
    }
}

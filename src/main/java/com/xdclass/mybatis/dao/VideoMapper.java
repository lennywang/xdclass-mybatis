package com.xdclass.mybatis.dao;

import com.xdclass.mybatis.domain.Video;
import org.apache.ibatis.annotations.Param;

/**
 * @author wll
 * @Description: ${todo}
 * @date 2020/7/6 23:16
 */
public interface VideoMapper {

    /**
     * @Description: 根据视频id 查找视频对象
     * @return com.xdclass.mybatis.domain.Video
    */
    Video selectById(@Param("video_id") int videoId);


    /**
     * @Description: 新增一条视频记录
     * @return int
    */
    int add(Video video);
}

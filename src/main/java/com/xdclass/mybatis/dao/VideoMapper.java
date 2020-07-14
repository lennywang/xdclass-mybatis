package com.xdclass.mybatis.dao;

import com.xdclass.mybatis.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface VideoMapper {

    /**
     * @Description: 根据视频id 查找视频对象
     * @return
    */
    Video selectById(@Param("video_id") int videoId);

    /**
     * @Description: 查询全部视频列表
     * @return
     */
    List<Video> selectListByXML();

    /**
     * @Description: 查询全部视频列表
    */
    @Select("select * from video")
    List<Video> selectList();

    /**
     * @Description: 根据评分和标题模糊查询
     * @param point 评分
     * @param title 标题
     * @return
    */
    List<Video> selectByPointAndTitleLike(@Param("point") double point,@Param("title")String title);

    /**
     * @Description: 新增一条视频记录
     * @return int
    */
    int add(Video video);

    /**
     * @Description: 批量插入
     * @param list
     * @return int
    */
    int addBatch(@Param("list")List<Video> list);

    /**
     * @Description: 更新视频
     * @param  video
     * @return int
    */
    int updateVideo(Video video);

    /**
     * @Description: 动态选择更新
     * @param video
     * @return int
    */
    int updateVideoSelective(Video video);

    /**
     * @Description: 根据时间和价格删除
     * @param map
     * @return int
    */
    int deleteByCreateTimeAndPrice(Map<String, Object> map);
}

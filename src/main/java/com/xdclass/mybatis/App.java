package com.xdclass.mybatis;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/8 0:05
 */


import com.xdclass.mybatis.dao.VideoMapper;
import com.xdclass.mybatis.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 **/
public class App {

    public static void main(String[] args) throws IOException {
        String resource = "config/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {

            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);

            //Video video = videoMapper.selectById(44);
            //System.out.println(video);

            //List<Video> videoList = videoMapper.selectListByXML();
            //System.out.println(videoList);

            //List<Video> videoList = videoMapper.selectList();
            //System.out.println(videoList);

            //List<Video> videoList = videoMapper.selectByPointAndTitleLike(8.7, "HTML");
            //System.out.println(videoList);

            // Video video = new Video();
            //video.setTitle("小滴课堂面试专题900道");
            //video.setSummary("这是面试专题概要");
            //video.setCoverImg("xdclass.net/aaa.png");
            //video.setPrice("200");
            //video.setcId(1);
            //video.setPoint(1);
            //int count = videoMapper.add(video);
            //System.out.println("新增条数：" + count);

             Video video1 = new Video();
            video1.setTitle("小滴课堂面试专题900道111");
            video1.setSummary("这是面试专题概要111");
            video1.setCoverImg("xdclass.net/aaa.png");
            video1.setPrice("200");
            video1.setcId(1);
            video1.setPoint(1);

            Video video2 = new Video();
            video2.setTitle("小滴课堂面试专题900道222");
            video2.setSummary("这是面试专题概要222");
            video2.setCoverImg("xdclass.net/aaa.png");
            video2.setPrice("200");
            video2.setcId(1);
            video2.setPoint(1);

            List<Video> videoList = new ArrayList<>();
            int count = videoMapper.addBatch(videoList);
            System.out.println("新增条数："+count);

//            Video video= new Video();
//            video.setId(49);
//            video.setTitle("update title test");
//            video.setCoverImg("update coverImg test");
//            videoMapper.updateVideo(video);

//            Video video= new Video();
//            video.setId(50);
//            video.setTitle("update title test");
//            video.setCoverImg("update coverImg test");
//            videoMapper.updateVideoSelective(video);

            Map<String,Object> map=new HashMap<>();
            map.put("createTime","");
            map.put("price",9);
            int num = videoMapper.deleteByCreateTimeAndPrice(map);
            System.out.println("删除条数："+count);


        }
    }
}

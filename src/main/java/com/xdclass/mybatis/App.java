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

            Video video = new Video();
            video.setTitle("小滴课堂面试专题900道");
            video.setSummary("这是面试专题概要");
            video.setCoverImg("xdclass.net/aaa.png");
            video.setPrice("200");
            video.setcId(1);
            video.setPoint(1);
            int count = videoMapper.add(video);

            System.out.println("新增条数：" + count);
        }
    }
}

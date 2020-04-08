package com.yang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author 张杨
 * @date 2020/4/7  0:33
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        /*
         * 使用mybatis第一步，获取sqlSessionFactory对象
         * */
        try {
            String resource = "mybatis-config.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory  = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
     * 第二步，获得SqlSession实例
     * */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession(true);

    }

}
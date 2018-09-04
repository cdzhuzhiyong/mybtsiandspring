package edu.swpu.mybatis;

import edu.swpu.mybatis.bean.User;
import edu.swpu.mybatis.mapper.UserMappper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException {
        String resource = "sqlmap/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("edu.swpu.mybatis.mapper.UserMappper.queryUserById",1);
        System.out.println(user);
        UserMappper userMappper = sqlSession.getMapper(UserMappper.class);
        User user1 = userMappper.queryUserById(2);
        System.out.println(user1);
        sqlSession.close();

    }
}

package edu.swpu.spring_mybatis.dao;


import edu.swpu.spring_mybatis.bean.User;
import edu.swpu.spring_mybatis.dao.base.BaseDao;

public interface UserDao extends BaseDao<User> {
    public String selectAccountNum(User condition) throws Exception;
}

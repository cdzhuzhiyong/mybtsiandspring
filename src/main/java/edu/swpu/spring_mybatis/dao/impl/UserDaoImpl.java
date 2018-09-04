package edu.swpu.spring_mybatis.dao.impl;

import edu.swpu.spring_mybatis.bean.User;
import edu.swpu.spring_mybatis.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    private static final String NAMESPACE = "edu.swpu.spring_mybatis.dao.UserDao.";
    @Override
    public String getNameSpace(String statement) {
        return NAMESPACE+statement;
    }
}

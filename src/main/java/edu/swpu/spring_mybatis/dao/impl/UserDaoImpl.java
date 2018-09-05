package edu.swpu.spring_mybatis.dao.impl;

import edu.swpu.spring_mybatis.bean.User;
import edu.swpu.spring_mybatis.dao.UserDao;
import edu.swpu.spring_mybatis.dao.base.BaseDaoImpl;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    private static final String NAMESPACE = "edu.swpu.spring_mybatis.dao.UserDao.";
    private static final String QUERY_ACCOUNTNUM_STATEMENT = "selectAccountNum";
    @Override
    public String getNameSpace(String statement) {
        return NAMESPACE+statement;
    }

    @Override
    public String selectAccountNum(User condition) throws Exception {
        return this.select(getNameSpace(QUERY_ACCOUNTNUM_STATEMENT),condition);
    }
}

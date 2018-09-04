package edu.swpu.spring_mybatis.service.impl;

import edu.swpu.spring_mybatis.bean.User;
import edu.swpu.spring_mybatis.dao.BaseDao;
import edu.swpu.spring_mybatis.dao.UserDao;
import edu.swpu.spring_mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public BaseDao<User> getDao() {
        return this.userDao;
    }
}

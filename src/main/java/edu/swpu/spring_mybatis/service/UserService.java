package edu.swpu.spring_mybatis.service;

import edu.swpu.spring_mybatis.bean.User;
import edu.swpu.spring_mybatis.service.base.BaseService;

public interface UserService extends BaseService<User> {
    public String selectAccountNum(User condition) throws Exception;
}

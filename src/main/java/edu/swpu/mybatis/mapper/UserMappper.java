package edu.swpu.mybatis.mapper;

import edu.swpu.mybatis.bean.User;

import java.util.Map;

public interface UserMappper {
    public User queryUserById(Integer id);

    public Map<String,Object> queryUser(Integer id);
}

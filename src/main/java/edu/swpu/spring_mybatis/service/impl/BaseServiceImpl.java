package edu.swpu.spring_mybatis.service.impl;

import edu.swpu.spring_mybatis.dao.BaseDao;
import edu.swpu.spring_mybatis.service.BaseService;

import java.util.List;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
    public abstract BaseDao<T> getDao();
    @Override
    public List<T> selectEntryList(T condition) {
        return getDao().selectEntryList(condition);
    }

    @Override
    public Integer selectEntryListCount(T condition) {
        return getDao().selectEntryListCount(condition);
    }
}

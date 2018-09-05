package edu.swpu.spring_mybatis.service.base;

import edu.swpu.spring_mybatis.dao.base.BaseDao;
import edu.swpu.spring_mybatis.service.base.BaseService;

import java.util.List;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
    public abstract BaseDao<T> getDao();
    @Override
    public List<T> selectEntryList(T condition) throws Exception {
        return getDao().selectEntryList(condition);
    }

    @Override
    public Integer selectEntryListCount(T condition) throws Exception {
        return getDao().selectEntryListCount(condition);
    }

    @Override
    public Integer insertEntry(T ... conditions) throws Exception {
        return getDao().insertEntry(conditions);
    }

    @Override
    public Integer updateEntry(T... conditions) throws Exception {
        return getDao().updateEntry(conditions);
    }

    @Override
    public Integer deleteEntry(T... conditions) throws Exception {
        return getDao().deleteEntry(conditions);
    }
}

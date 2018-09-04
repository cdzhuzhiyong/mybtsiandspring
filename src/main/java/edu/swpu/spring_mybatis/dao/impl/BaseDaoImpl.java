package edu.swpu.spring_mybatis.dao.impl;

import edu.swpu.spring_mybatis.dao.BaseDao;
import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;
import java.util.List;

public abstract class BaseDaoImpl<T> implements BaseDao<T> {
    private static final String DEFAULT_SELECT_CONDTION = "selectEntryList";
    private static final String DEFAULT_SELECT_CONDITIONCOUNT = "selectEntryListCount";

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;


    public abstract String getNameSpace(String statement);

    @Override
    public List<T> selectEntryList(T condition) {
        return this.sqlSessionTemplate.selectList(getNameSpace(DEFAULT_SELECT_CONDTION),condition);
    }

    @Override
    public Integer selectEntryListCount(T condition) {
        return this.sqlSessionTemplate.selectOne(getNameSpace(DEFAULT_SELECT_CONDITIONCOUNT),condition);
    }
}

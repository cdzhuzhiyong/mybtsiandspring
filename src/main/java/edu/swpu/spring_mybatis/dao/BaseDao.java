package edu.swpu.spring_mybatis.dao;

import java.util.List;

public interface BaseDao<T> {
    List<T> selectEntryList(T condition);
    Integer selectEntryListCount(T condition);
}

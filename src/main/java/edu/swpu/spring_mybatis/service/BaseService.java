package edu.swpu.spring_mybatis.service;

import java.util.List;

public interface BaseService<T> {
    List<T> selectEntryList(T condition);
    Integer selectEntryListCount(T condition);
}

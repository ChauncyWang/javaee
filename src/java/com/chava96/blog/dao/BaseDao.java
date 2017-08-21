package com.chava96.blog.dao;

import java.util.List;

public interface BaseDao<T> {
    void insert(T t);

    void delete(int id);

    void update(T t);

    T select(int id);

    List<T> findAll();
}

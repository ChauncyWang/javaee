package com.chava96.blog.dao;

import com.chava96.blog.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao extends BaseDao<User> {
    void insert(User user);

    void delete(int id);

    void update(User user);

    User select(int id);

    List<User> findAll();
}

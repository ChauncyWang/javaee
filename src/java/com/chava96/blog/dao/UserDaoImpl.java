package com.chava96.blog.dao;

import com.chava96.blog.models.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Resource
    private SqlSessionFactory sqlSessionFactory;

    private SqlSession sqlSession;

    private UserDao userDao;

    @PostConstruct
    public void SqlSessionFactory() {
        super.setSqlSessionFactory(sqlSessionFactory);
        sqlSession = getSqlSession();
        userDao = sqlSession.getMapper(UserDao.class);
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User select(int id) {
        return userDao.select(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}

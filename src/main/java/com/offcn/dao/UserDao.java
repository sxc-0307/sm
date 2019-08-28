package com.offcn.dao;

import com.offcn.po.User;

import java.util.List;

public interface UserDao{

    public void save(User user);

    public void update(User user);

    public void delete(Long id);

    public List<User> getAll();

    public User findOne(Long id);


}
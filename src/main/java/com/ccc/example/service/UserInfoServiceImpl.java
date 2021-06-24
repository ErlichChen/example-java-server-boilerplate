package com.ccc.example.service;

import com.ccc.example.bean.UserInfo;
import com.ccc.example.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public void create(UserInfo userInfo) {
        userInfoDao.insertUserInfo(userInfo);
    }

    @Override
    public void read() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}

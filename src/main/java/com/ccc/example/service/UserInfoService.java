package com.ccc.example.service;

import com.ccc.example.bean.UserInfo;

public interface UserInfoService {
    void create(UserInfo userInfo);
    void read();
    void update();
    void delete();
}

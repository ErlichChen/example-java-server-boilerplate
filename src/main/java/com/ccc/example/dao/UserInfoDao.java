package com.ccc.example.dao;

import com.ccc.example.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoDao {
    void insertUserInfo(UserInfo userInfo);
}

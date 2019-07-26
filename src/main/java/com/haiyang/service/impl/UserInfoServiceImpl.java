package com.haiyang.service.impl;

import com.haiyang.mapper.UserInfoMapper;
import com.haiyang.entity.UserInfo;
import com.haiyang.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auth hywang
 * @Email hywang2017@qq.com
 * @Date 2017/10/21
 */
//@Service  对于接口来说 这个service是必不可少的
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
   private UserInfoMapper userInfoDao;

    @Override
    public UserInfo getUserInfoByName(String name) {
        return userInfoDao.getUserInfoByName(name);
    }
}

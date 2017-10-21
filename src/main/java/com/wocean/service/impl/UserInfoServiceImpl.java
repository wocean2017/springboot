package com.wocean.service.impl;

import com.wocean.mapper.UserInfoMapper;
import com.wocean.entity.UserInfo;
import com.wocean.service.UserInfoService;
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

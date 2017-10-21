package com.wocean.service;

import com.wocean.entity.UserInfo;
import org.springframework.stereotype.Service;

/**
 * @Auth hywang
 * @Email hywang2017@qq.com
 * @Date 2017/10/21
 */

public interface UserInfoService {
    UserInfo getUserInfoByName(String name);
}

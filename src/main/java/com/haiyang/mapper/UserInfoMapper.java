package com.haiyang.mapper;

import com.haiyang.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * @Auth hywang
 * @Email hywang2017@qq.com
 * @Date 2017/10/21
 */
@Mapper // 标志为 Mybatis 的 Mapper
public interface UserInfoMapper {
    // sql注解
    @Select("select * from user_info where user_name = #{user_name} limit 1")
    //结构集
    @Results({
            @Result(property = "name" ,column = "user_name"),
            @Result(property = "age" ,column = "user_age")
    })
    UserInfo getUserInfoByName(@Param("user_name") String name);
}

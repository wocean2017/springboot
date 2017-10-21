package com.wocean.entity;

/**
 * @Auth hywang
 * @Email hywang2017@qq.com
 * @Date 2017/10/21
 */
public class UserInfo {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserInfo() {
    }

    @Override
    public String toString() {

        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



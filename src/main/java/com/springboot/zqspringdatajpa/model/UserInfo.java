package com.springboot.zqspringdatajpa.model;

//多表关联实现使用 结果集接口 的方式
//定义一个结果集的接口类，接口类的内容来自于用户表和用户详情表
public interface UserInfo {
	String getUserName();
	String getEmail();
	String getHobby();
	String getIntroduction();
}
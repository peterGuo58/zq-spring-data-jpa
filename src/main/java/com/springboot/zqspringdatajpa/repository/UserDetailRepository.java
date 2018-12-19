package com.springboot.zqspringdatajpa.repository;

import com.springboot.zqspringdatajpa.model.UserDetail;
import com.springboot.zqspringdatajpa.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/*多表查询在 Spring Data JPA 中有两种实现方式，
第一种是利用 Hibernate 的级联查询来实现，
第二种是创建一个结果集的接口来接收连表查询后的结果，这里主要使用第二种方式。
*/
public interface UserDetailRepository extends JpaSpecificationExecutor<UserDetail>,JpaRepository<UserDetail, Long>  {

    UserDetail findByHobby(String hobby);
//    特别注意这里的 SQL 是 HQL，需要写类的名和属性，这块很容易出错
    @Query("select u.userName as userName, u.email as email, d.introduction as introduction , d.hobby as hobby from User u , UserDetail d " +
            "where u.id=d.userId  and  d.hobby = ?1 ")
    List<UserInfo> findUserInfo(String hobby);
}
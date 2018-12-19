package com.springboot.zqspringdatajpa.repository;

import com.springboot.zqspringdatajpa.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/*dao 只要继承 JpaRepository 类就可以，几乎可以不用写方法，
还有一个特别有尿性的功能非常赞，就是可以根据方法名来自动的生产 SQL，
比如 findByUserName 会自动生产一个以 userName 为参数的查询方法，
比如 findAll 自动会查询表里面的所有数据，比如自动分页等。
Entity 中不映射成列的字段得加 @Transient 注解，不加注解也会映射成列。*/

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);

    @Transactional(timeout = 10)
    @Modifying
    @Query("update User set userName = ?1 where id = ?2")
    int modifyById(String userName, Long id);

    @Transactional
    @Modifying
    @Query("delete from User where id = ?1")
    void deleteById(Long id);

    @Query("select u from User u where u.email = ?1")
    User findByEmail(String email);

    @Query("select u from User u")
    Page<User> findALL(Pageable pageable);

    Page<User> findByNickName(String nickName, Pageable pageable);

    Slice<User> findByNickNameAndEmail(String nickName, String email, Pageable pageable);


}
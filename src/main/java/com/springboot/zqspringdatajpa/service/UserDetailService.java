package com.springboot.zqspringdatajpa.service;

import com.springboot.zqspringdatajpa.Param.UserDetailParam;
import com.springboot.zqspringdatajpa.model.UserDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserDetailService {
    public Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable);
}

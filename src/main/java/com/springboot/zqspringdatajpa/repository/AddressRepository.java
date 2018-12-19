package com.springboot.zqspringdatajpa.repository;

import com.springboot.zqspringdatajpa.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
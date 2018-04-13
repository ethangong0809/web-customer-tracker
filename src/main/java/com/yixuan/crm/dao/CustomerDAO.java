package com.yixuan.crm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yixuan.crm.bean.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Integer> {	
}

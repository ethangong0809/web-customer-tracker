package com.yixuan.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yixuan.crm.bean.Customer;
import com.yixuan.crm.dao.CustomerDAO;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	CustomerDAO customerDao;
	
	@Transactional
	public List<Customer> getAllCustomers()
    {
       return customerDao.findAll();
    }
	
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDao.save(theCustomer);
	}

}

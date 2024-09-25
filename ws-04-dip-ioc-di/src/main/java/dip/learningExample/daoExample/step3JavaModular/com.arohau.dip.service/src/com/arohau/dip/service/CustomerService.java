package com.arohau.dip.service;

import com.arohau.dip.dao.CustomerDao;
import com.arohau.dip.entity.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerService {

    private CustomerDao customerDao;

    public CustomerService() {
    }

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public Optional<Customer> findById(int id) {
        return customerDao.findById(id);
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}

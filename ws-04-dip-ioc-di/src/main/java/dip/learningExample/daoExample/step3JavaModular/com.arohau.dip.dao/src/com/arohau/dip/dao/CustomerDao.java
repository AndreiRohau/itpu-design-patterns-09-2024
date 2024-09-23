package com.arohau.dip.dao;

import com.arohau.dip.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    Optional<Customer> findById(int id);
    List<Customer> findAll();
}

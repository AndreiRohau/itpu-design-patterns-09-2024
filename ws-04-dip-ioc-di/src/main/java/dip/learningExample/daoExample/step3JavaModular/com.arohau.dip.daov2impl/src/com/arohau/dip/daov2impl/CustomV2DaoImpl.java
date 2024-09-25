package com.arohau.dip.daov2impl;

import com.arohau.dip.dao.CustomerDao;
import com.arohau.dip.entity.Customer;

import java.util.*;

public class CustomV2DaoImpl implements CustomerDao {
    private Map<Integer, Customer> customers = new HashMap<>();

    public CustomV2DaoImpl() {
    }

    public CustomV2DaoImpl(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    @Override
    public Optional<Customer> findById(int id) {
        System.out.println("CustomV2DaoImpl findById");
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public List<Customer> findAll() {
        System.out.println("CustomV2DaoImpl findAll");
        return new ArrayList<>(customers.values());
    }

    public void setCustomers(Map<Integer, Customer> customers) {
        this.customers = customers;
    }
}

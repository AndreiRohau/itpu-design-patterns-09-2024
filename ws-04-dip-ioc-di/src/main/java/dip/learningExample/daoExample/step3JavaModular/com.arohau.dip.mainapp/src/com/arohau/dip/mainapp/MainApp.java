package com.arohau.dip.mainapp;

import com.arohau.dip.daoimpl.SimpleCustomerDao;
import com.arohau.dip.entity.Customer;
import com.arohau.dip.service.CustomerService;
import java.util.HashMap;

public class MainApp {

    public static void main(String args[]) {
        var customers = new HashMap<Integer, Customer>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        CustomerService customerService = new CustomerService(new SimpleCustomerDao(customers));
        customerService.findAll().forEach(System.out::println);
    }
}

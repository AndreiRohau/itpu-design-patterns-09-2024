package com.arohau.dip.mainapp;

import com.arohau.dip.daoimpl.SimpleCustomerDao;
import com.arohau.dip.daov2impl.CustomV2DaoImpl;
import com.arohau.dip.entity.Customer;
import com.arohau.dip.service.CustomerService;
import java.util.HashMap;

public class MainApp {

    public static void main(String args[]) {
        var customers = new HashMap<Integer, Customer>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));

        CustomerService simpleCustomerService = new CustomerService(new SimpleCustomerDao(customers));
        CustomerService customerServiceV2 = new CustomerService(new CustomV2DaoImpl(customers));

        simpleCustomerService.findAll().forEach(System.out::println);
        customerServiceV2.findAll().forEach(System.out::println);
    }
}

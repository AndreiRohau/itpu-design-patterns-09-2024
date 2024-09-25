package com.arohau.dip.mainapp;

import com.arohau.dip.dao.CustomerDao;
import com.arohau.dip.entity.Customer;
import com.arohau.dip.service.CustomerService;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;

public class MainApp {

    public static void main(String[] args) {
        var customers = new HashMap<Integer, Customer>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));

        ServiceLoader<CustomerService> customerServices = ServiceLoader.load(CustomerService.class);
        CustomerService customerService = customerServices.findFirst().orElse(null);

        ServiceLoader<CustomerDao> customerDaos = ServiceLoader.load(CustomerDao.class);
        List<CustomerDao> daos = customerDaos.stream()
                .map(ServiceLoader.Provider::get)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        for (CustomerDao dao : daos) {
            customerService.setCustomerDao(dao);
            customerService.findAll().forEach(System.out::println);
            System.out.println();
        }
    }
}

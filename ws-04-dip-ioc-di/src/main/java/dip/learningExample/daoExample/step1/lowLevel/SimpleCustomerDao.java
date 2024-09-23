package dip.learningExample.daoExample.step1.lowLevel;

import dip.learningExample.daoExample.step1.module.CustomerDao;
import dip.learningExample.daoExample.step1.module.domain.Customer;
import dip.learningExample.daoExample.step1.module.domain.Id;

import java.util.*;

public class SimpleCustomerDao implements CustomerDao {
    // *** emulation of a database ***
    private final Map<Long, Customer> customers;

    // initializing database \ connection with database \ etc.
    public SimpleCustomerDao(Map<Long, Customer> customers) {
        this.customers = customers;
    }

    @Override
    public Optional<Customer> findById(Id id) {
        return Optional.ofNullable(customers.get(id.getId()));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
}

package dip.learningExample.daoExample.step2.lowLevel;

import dip.learningExample.daoExample.step2.abstraction.CustomerDao;
import dip.learningExample.daoExample.step2.domain.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SimpleCustomerDao implements CustomerDao {
    // *** emulation of a database ***
    private final Map<Integer, Customer> customers;

    // initializing database \ connection with database \ etc.
    public SimpleCustomerDao(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    @Override
    public Optional<Customer> findById(int id) {
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
}

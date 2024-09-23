package dip.learningExample.daoExample.step1.module;

import dip.learningExample.daoExample.step1.module.domain.Customer;
import dip.learningExample.daoExample.step1.module.domain.Id;

import java.util.List;
import java.util.Optional;

// ACHIEVED DIP :
// now implementation (of dependency CustomerDaoImpl\SimpleCustomerDao) depends on Abstraction (CustomerDao interface),
// which locates in dependant module (CustomerService module\package)
// notice Inversion of Dependency relations
public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    // standard constructor / getter

    public Optional<Customer> findById(Id id) {
        return customerDao.findById(id);
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}

package dip.learningExample.daoExample.step2.abstraction;

import dip.learningExample.daoExample.step2.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {

    Optional<Customer> findById(int id);

    List<Customer> findAll();

}

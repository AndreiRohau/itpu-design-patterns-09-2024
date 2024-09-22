package dip.learningExample.daoExample.step1.module;

import dip.learningExample.daoExample.step1.module.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {

    Optional<Customer> findById(int id);

    List<Customer> findAll();

}


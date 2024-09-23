package dip.learningExample.daoExample.step1.module;

import dip.learningExample.daoExample.step1.module.domain.Customer;
import dip.learningExample.daoExample.step1.module.domain.Id;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    Optional<Customer> findById(Id id);
    List<Customer> findAll();
}


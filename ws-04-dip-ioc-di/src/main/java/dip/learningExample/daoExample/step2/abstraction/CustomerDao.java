package dip.learningExample.daoExample.step2.abstraction;

import dip.learningExample.daoExample.step2.domain.Customer;
import dip.learningExample.daoExample.step2.domain.Id;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {

    Optional<Customer> findById(Id id);

    List<Customer> findAll();

}

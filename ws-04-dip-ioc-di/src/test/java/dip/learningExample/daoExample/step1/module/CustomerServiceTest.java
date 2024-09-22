package dip.learningExample.daoExample.step1.module;

import dip.learningExample.daoExample.step1.lowLevel.SimpleCustomerDao;
import dip.learningExample.daoExample.step1.module.domain.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerServiceTest {
    private CustomerService customerService;

    @BeforeEach
    public void setUpCustomerServiceInstance() {
        var customers = new HashMap<Integer, Customer>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        customerService = new CustomerService(new SimpleCustomerDao(customers));
    }

    @Test
    public void givenCustomerServiceInstance_whenCalledFindById_thenCorrect() {
        assertThat(customerService.findById(1)).isInstanceOf(Optional.class);
    }

    @Test
    public void givenCustomerServiceInstance_whenCalledFindAll_thenCorrect() {
        assertThat(customerService.findAll()).isInstanceOf(List.class);
    }

    @Test
    public void givenCustomerServiceInstance_whenCalledFindByIdWithNullCustomer_thenCorrect() {
        var customers = new HashMap<Integer, Customer>();
        customers.put(1, null);
        // In most cases, we’d use some kind of DI container or framework to accomplish this.
        // init components injecting dependencies
        customerService = new CustomerService(new SimpleCustomerDao(customers));
        Customer customer = customerService.findById(1).orElseGet(() -> new Customer("Non-existing customer"));
        assertThat(customer.getName()).isEqualTo("Non-existing customer");
    }

}
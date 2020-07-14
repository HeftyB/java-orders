package local.heftyb.javaorders.services;

import local.heftyb.javaorders.models.Customer;

import java.util.List;

public interface CustomerService
{
    List<Customer> findAllCustomers();

    Customer findCustomerById(long id);

    List<Customer> findByNameLike(String name);
}

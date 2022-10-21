package com.codegym.cms.repository.customer;

import com.codegym.cms.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
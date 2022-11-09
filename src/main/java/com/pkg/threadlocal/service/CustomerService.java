package com.pkg.threadlocal.service;

import com.pkg.threadlocal.dto.customers.CustomerDto;

public interface CustomerService {

    CustomerDto getCustomerOrderDetails(String customerName);
}

package com.pkg.threadlocal.service.impl;

import com.pkg.threadlocal.dto.customers.CustomerDto;
import com.pkg.threadlocal.dto.orders.OrderDto;
import com.pkg.threadlocal.logger.LoggerService;
import com.pkg.threadlocal.service.CustomerService;
import com.pkg.threadlocal.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final OrderService orderService;

    private final LoggerService logger;

    @Override
    public CustomerDto getCustomerOrderDetails(final String customerName) {
        final String operation = "CustomerService -> getCustomerOrderDetails";
        logger.operationStarted(customerName);
        final OrderDto orders = orderService.getOrders(customerName);
        logger.operationCompleted(operation);
        return CustomerDto.builder().name(customerName).orders(Collections.singletonList(orders)).build();
    }
}

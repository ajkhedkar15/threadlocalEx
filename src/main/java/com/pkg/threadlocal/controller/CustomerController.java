package com.pkg.threadlocal.controller;

import com.pkg.threadlocal.dto.Response;
import com.pkg.threadlocal.dto.customers.CustomerDto;
import com.pkg.threadlocal.logger.LoggerService;
import com.pkg.threadlocal.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final LoggerService logger;

    private final CustomerService customerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response<CustomerDto>> getCustomerOrders(@RequestParam(name = "customerName") final String customerName) {
        final String operation = "CustomerController -> getCustomerOrders";
        logger.operationStarted(operation);
        final CustomerDto customerOrderDetails = customerService.getCustomerOrderDetails(customerName);
        logger.operationCompleted(operation);
        return ResponseEntity.ok(Response.build(customerOrderDetails));
    }
}

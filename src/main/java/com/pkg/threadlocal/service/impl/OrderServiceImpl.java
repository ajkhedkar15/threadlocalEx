package com.pkg.threadlocal.service.impl;

import com.pkg.threadlocal.dto.orders.OrderDto;
import com.pkg.threadlocal.dto.products.ProductDto;
import com.pkg.threadlocal.logger.LoggerService;
import com.pkg.threadlocal.service.OrderService;
import com.pkg.threadlocal.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final LoggerService logger;

    private final ProductService productService;

    @Override
    public OrderDto getOrders(final String customer) {
        final String operation = "OrderService -> getOrders";
        logger.operationStarted(operation);
        final Integer orderId = 1011;
        final ProductDto productDetails = productService.getProductDetails(orderId);
        logger.operationCompleted(operation);
        return OrderDto.builder().orderId(orderId).orderDate("2022-11-09").orderAmount(23500.00)
                .orderStatus("In-Progress").productDetails(productDetails).build();
    }
}

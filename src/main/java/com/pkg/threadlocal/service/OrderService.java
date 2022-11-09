package com.pkg.threadlocal.service;

import com.pkg.threadlocal.dto.orders.OrderDto;

public interface OrderService {

    OrderDto getOrders(String customer);


}

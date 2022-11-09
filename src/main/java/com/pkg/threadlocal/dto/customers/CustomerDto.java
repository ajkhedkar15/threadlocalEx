package com.pkg.threadlocal.dto.customers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pkg.threadlocal.dto.orders.OrderDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(content = JsonInclude.Include.NON_EMPTY)
public class CustomerDto {

    private String name;
    private List<OrderDto> orders;
}

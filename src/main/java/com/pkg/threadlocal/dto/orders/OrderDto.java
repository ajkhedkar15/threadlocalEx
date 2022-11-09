package com.pkg.threadlocal.dto.orders;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pkg.threadlocal.dto.products.ProductDto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(content = JsonInclude.Include.NON_EMPTY)
public class OrderDto {

    private Integer orderId;
    private String orderStatus;
    private String orderDate;
    private Double orderAmount;
    private ProductDto productDetails;


}

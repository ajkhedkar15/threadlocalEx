package com.pkg.threadlocal.service.impl;

import com.pkg.threadlocal.dto.products.ProductDto;
import com.pkg.threadlocal.logger.LoggerService;
import com.pkg.threadlocal.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final LoggerService logger;

    @Override
    public ProductDto getProductDetails(final Integer orderNo) {
        final String operation = "ProductService -> getProductDetails";
        logger.operationStarted(operation);
        final ProductDto build = ProductDto.builder().id(123).productName("One Plus CE2").category("Mobiles").build();
        logger.operationCompleted(operation);
        return build;
    }
}

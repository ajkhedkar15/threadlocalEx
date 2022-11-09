package com.pkg.threadlocal.service;

import com.pkg.threadlocal.dto.products.ProductDto;

public interface ProductService {

    ProductDto getProductDetails(Integer orderNo);
}

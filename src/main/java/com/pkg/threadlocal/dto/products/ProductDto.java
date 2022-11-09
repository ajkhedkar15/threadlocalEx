package com.pkg.threadlocal.dto.products;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(content = JsonInclude.Include.NON_EMPTY)
public class ProductDto {

    private Integer id;
    private String productName;
    private String category;
}

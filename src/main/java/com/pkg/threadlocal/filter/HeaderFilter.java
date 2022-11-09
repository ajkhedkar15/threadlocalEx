package com.pkg.threadlocal.filter;

import com.pkg.threadlocal.dto.threadlocal.RequestDetailsHolder;
import com.pkg.threadlocal.logger.LoggerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@RequiredArgsConstructor
public class HeaderFilter extends OncePerRequestFilter {

    private final LoggerService log;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        log.info("HeaderFilter -> doFilterInternal started");
        final String customerId = request.getHeader("customerId");
        log.info(customerId);
        RequestDetailsHolder.setCustomerId(customerId);
        final String customerType = request.getHeader("customerType");
        log.info(customerType);
        RequestDetailsHolder.setCustomerType(customerType);
        log.info("HeaderFilter -> doFilterInternal completed");
        filterChain.doFilter(request, response);
    }
}

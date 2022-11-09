package com.pkg.threadlocal.logger.impl;

import com.pkg.threadlocal.dto.threadlocal.RequestDetailsHolder;
import com.pkg.threadlocal.logger.LoggerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LoggerServiceImpl implements LoggerService {

    @Override
    public void info(String s) {
        log.info(s);
    }

    /**
     * @param operation operation
     */
    @Override
    public void operationStarted(final String operation) {
        final String msg = String.format("%s : operation started for customer id '%s'", operation, RequestDetailsHolder.getCustomerId());
        log.info(msg);
    }

    /**
     * @param operation operation
     */
    @Override
    public void operationCompleted(final String operation) {
        final String msg = String.format("%s : operation completed successfully for customer id '%s'.", operation, RequestDetailsHolder.getCustomerId());
        log.info(msg);
    }

    @Override
    public void operationFailed(final String operation, final String message) {
        final String msg = String.format("%s : operation failed for customer id '%s'. Exception '%s'", operation, RequestDetailsHolder.getCustomerId(), message);
        log.info(msg);
    }


}

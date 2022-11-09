package com.pkg.threadlocal.logger;

public interface LoggerService {

    void info(String s);

    void operationStarted(String operation);

    void operationCompleted(String operation);

    void operationFailed(String operation, String message);

}

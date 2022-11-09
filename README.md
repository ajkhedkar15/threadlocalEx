# threadlocal Example

This is the basic example of ThreadLocal. 
 While developing enterprise application ofter we caame across the scenarios to log or get certain values while returning response or processing applicartion. Every time it is not feasible to get the required values in Request param or body and we can not pass all params to every method. This application helps to log customer id in every log statement using thread local.


#### API Details

API Curl - 
curl --location --request GET 'http://localhost:8085/customer-service/api/v1/customers?customerName=ak' \
--header 'customerId: 151291' \
--header 'customerType: prime' \
--header 'Content-Type: application/json'

Sample Log Details -


2022-11-09 13:25:09.364  INFO 19916 --- [nio-8085-exec-1] c.p.t.logger.impl.LoggerServiceImpl      : HeaderFilter -> doFilterInternal started
2022-11-09 13:25:09.364  INFO 19916 --- [nio-8085-exec-1] c.p.t.logger.impl.LoggerServiceImpl      : 151291
2022-11-09 13:25:09.365  INFO 19916 --- [nio-8085-exec-1] c.p.t.logger.impl.LoggerServiceImpl      : prime
2022-11-09 13:25:09.366  INFO 19916 --- [nio-8085-exec-1] c.p.t.logger.impl.LoggerServiceImpl      : HeaderFilter -> doFilterInternal completed
2022-11-09 13:25:09.395  INFO 19916 --- [nio-8085-exec-1] c.p.t.logger.impl.LoggerServiceImpl      : CustomerController -> getCustomerOrders : operation started for customer id '151291'
2022-11-09 13:25:09.395  INFO 19916 --- [nio-8085-exec-1] c.p.t.logger.impl.LoggerServiceImpl      : ak : operation started for customer id '151291'
2022-11-09 13:25:09.395  INFO 19916 --- [nio-8085-exec-1] c.p.t.logger.impl.LoggerServiceImpl      : OrderService -> getOrders : operation started for customer id '151291'
2022-11-09 13:25:09.396  INFO 19916 --- [nio-8085-exec-1] c.p.t.logger.impl.LoggerServiceImpl      : ProductService -> getProductDetails : operation started for customer id '151291'
2022-11-09 13:25:09.396  INFO 19916 --- [nio-8085-exec-1] c.p.t.logger.impl.LoggerServiceImpl      : ProductService -> getProductDetails : operation completed successfully for customer id '151291'.
2022-11-09 13:25:09.396  INFO 19916 --- [nio-8085-exec-1] c.p.t.logger.impl.LoggerServiceImpl      : OrderService -> getOrders : operation completed successfully for customer id '151291'.
2022-11-09 13:25:09.396  INFO 19916 --- [nio-8085-exec-1] c.p.t.logger.impl.LoggerServiceImpl      : CustomerService -> getCustomerOrderDetails : operation completed successfully for customer id '151291'.
2022-11-09 13:25:09.398  INFO 19916 --- [nio-8085-exec-1] c.p.t.logger.impl.LoggerServiceImpl      : CustomerController -> getCustomerOrders : operation completed successfully for customer id '151291'.

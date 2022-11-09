package com.pkg.threadlocal.dto.threadlocal;

import org.springframework.util.ObjectUtils;

public class RequestDetailsHolder {

    private static final ThreadLocal<RequestDetails>
            REQUEST_DETAILS = new ThreadLocal<>();


    public static synchronized void setRequestDetails(final RequestDetails requestDetails) {
        REQUEST_DETAILS.set(requestDetails);
    }

    public static RequestDetails getRequestDetails() {
        final RequestDetails requestDetails = REQUEST_DETAILS.get();
        if (ObjectUtils.isEmpty(requestDetails)) {
            return new RequestDetails();
        }
        return requestDetails;

    }

    public static String getCustomerId() {
        final RequestDetails requestDetails = RequestDetailsHolder.getRequestDetails();
        return requestDetails.getCustomerId();
    }

    public static void setCustomerId(final String id) {
        final RequestDetails requestDetails = RequestDetailsHolder.getRequestDetails();
        requestDetails.setCustomerId(id);
        RequestDetailsHolder.setRequestDetails(requestDetails);
    }

    public static String getCustomerType() {
        final RequestDetails requestDetails = RequestDetailsHolder.getRequestDetails();
        return requestDetails.getCustomerType();
    }

    public static void setCustomerType(final String customerType) {
        final RequestDetails requestDetails = RequestDetailsHolder.getRequestDetails();
        requestDetails.setCustomerType(customerType);
        RequestDetailsHolder.setRequestDetails(requestDetails);
    }

}


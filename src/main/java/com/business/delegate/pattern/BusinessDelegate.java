package com.business.delegate.pattern;

public class BusinessDelegate {
    private BusinessLookup lookupService = new BusinessLookup();
    private BusinessService service;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask(){
        service = lookupService.getBusinessService(serviceType);
        service.doProcessing();
    }
}

package com.service.locator.pattern;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Service> services;

    public Cache() {
        services = new ArrayList<Service>();
    }

    public Service getService(String name) {
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(name)) {
                System.out.println("Returning cached service: " + name);
                return service;
            }
        }

        return null;
    }

    public void addService(Service newService) {
        boolean exists = false;
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(newService.getName())) {
                exists = true;
            }
        }

        if (!exists) {
            services.add(newService);
        }
    }
}

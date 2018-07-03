package com.prueba;

import com.prueba.com.prueba.services.HelloWorldService;
import com.prueba.com.prueba.services.HelloWorldServiceImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class JosemyActivator implements BundleActivator {

    private ServiceRegistration registration;

    public void start(BundleContext context) throws Exception {

        registration = context.registerService(
                HelloWorldService.class.getName(),
                new HelloWorldServiceImpl(),
                null);
        System.out.println("Service registered");
    }

    public void stop(BundleContext context) throws Exception {
        registration.unregister();
        System.out.println("Goodbye World");
    }
}

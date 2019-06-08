package org.sergei.core.services;

import java.util.ServiceLoader;

/**
 * @author Sergei Visotsky
 */
public class ServiceLoaderSample {

    public static void main(String[] args) {

        ServiceLoader<Descriptor> serviceLoader = ServiceLoader.load(Descriptor.class);
        serviceLoader.forEach(System.out::println);

    }

}

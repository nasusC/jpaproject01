package com.ict01.jpaproject01;

public class ResourceNotFoundExeption extends Exception {

    public static final long serialVersionUID = 1L;

    public ResourceNotFoundExeption(Object resourceId){
        super(resourceId != null ? resourceId.toString() : null);
    }
}

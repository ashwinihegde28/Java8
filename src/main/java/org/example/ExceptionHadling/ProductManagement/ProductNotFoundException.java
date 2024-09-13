package org.example.ExceptionHadling.ProductManagement;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(String message) {
        super(message);

        System.out.println("ProductNotFoundException");
    }



}

package org.example.ExceptionHadling.ProductManagement;

public class Product {


    private String productName;
    private double price;

    private static Product[] productArray = new Product[4];
    private static int productCount = 0;

    public Product() {

    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    private static final Product[] PRODUCTS = {
            new Product("Bag", 20.0),
            new Product("Mug", 5.0),
            new Product("Smartphone", 900.0)
    };


    public static Product findProduct(String productName) {
        for (Product product : PRODUCTS) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        throw new ProductNotFoundException("Product not found: " + productName);
    }

    public void addToCart(String productName) {
        try {
            Product product = Product.findProduct(productName);
            System.out.println("Product " + productName + " added to cart.");
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

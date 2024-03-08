package org.example;

import java.math.BigDecimal;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private String color;

    public static Builder builder(){
        return new Builder();
    }
    public static class Builder{
        private Product product = new Product();

        public Builder setId(int id){
            product.id = id;
            return this;
        }

        public Builder setName(String name){
            product.name = name;
            return this;
        }

        public Builder setPrice(BigDecimal price){
            product.price = price;
            return this;
        }

        public Builder setColor(String color){
            product.color = color;
            return this;
        }

        public Product build(){
            return product;
        }
    }
}

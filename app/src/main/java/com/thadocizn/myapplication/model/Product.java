package com.thadocizn.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("product_id")
    private long productId;

    @SerializedName("product_name")
    private String productName;

    @SerializedName("product_description")
    private String productDescription;

    @SerializedName("price")
    private double price;

    @SerializedName("quantity")
    private int quantity;

    public Product(long productId,
                   String productName,
                   String productDescription,
                   double price,
                   int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.quantity = quantity;
    }

}

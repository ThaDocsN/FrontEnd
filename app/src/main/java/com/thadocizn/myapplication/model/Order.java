package com.thadocizn.myapplication.model;

import com.google.gson.annotations.SerializedName;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;


public class Order extends BaseObservable {

    @SerializedName("order_id")
    private long orderId;

    @SerializedName("product_name")
    private String productName;

    @SerializedName("shipping_address")
    private String shippingAddress;

    @SerializedName("payment_details")
    private String paymentDetails;

    @SerializedName("has_shipped")
    private boolean hasShipped;

    @SerializedName("product_quantity")
    private int productQuantity;

    public Order(long orderId,
                 String productName,
                 String shippingAddress,
                 String paymentDetails,
                 boolean hasShipped,
                 int productQuantity) {
        this.orderId = orderId;
        this.productName = productName;
        this.shippingAddress = shippingAddress;
        this.paymentDetails = paymentDetails;
        this.hasShipped = hasShipped;
        this.productQuantity = productQuantity;
    }

    @Bindable
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
        notifyPropertyChanged(BR.orderId);
    }

    @Bindable
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
        notifyPropertyChanged(BR.productName);
    }

    @Bindable
    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
        notifyPropertyChanged(BR.shippingAddress);
    }

    @Bindable
    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
        notifyPropertyChanged(BR.paymentDetails);
    }

    @Bindable
    public boolean isHasShipped() {
        return hasShipped;
    }

    public void setHasShipped(boolean hasShipped) {
        this.hasShipped = hasShipped;
        notifyPropertyChanged(BR.hasShipped);
    }

    @Bindable
    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
        notifyPropertyChanged(BR.productQuantity);
    }
}

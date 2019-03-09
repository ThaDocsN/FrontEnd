package com.thadocizn.myapplication.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

import com.google.gson.annotations.SerializedName;

public class Cart extends BaseObservable {

    @SerializedName("cart_id")
    private long cartId;
    @SerializedName("name")
    private String name;
    @SerializedName("quantity")
    private int quantity;

    public Cart(long cartId, String name, int quantity) {
        this.cartId = cartId;
        this.name = name;
        this.quantity = quantity;
    }

    @Bindable
    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
        notifyPropertyChanged(BR.cartId);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);

    }

    @Bindable
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyPropertyChanged(BR.quantity);

    }
}

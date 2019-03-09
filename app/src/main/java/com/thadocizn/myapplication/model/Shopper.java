package com.thadocizn.myapplication.model;

import com.google.gson.annotations.SerializedName;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class Shopper extends BaseObservable {
    @SerializedName("shopper_id")
    private long shopperId;

    @SerializedName("bill_address")
    private String billAddress;

    @SerializedName("ship_address")
    private String shipAddress;

    @SerializedName("phone_number")
    private String phoneNumber;

    @SerializedName("payment_method")
    private String paymentMethod;


    public Shopper() {

    }

    public Shopper(long shopperId,
                   String billAddress,
                   String shipAddress,
                   String phoneNumber,
                   String paymentMethod) {
        this.shopperId = shopperId;
        this.billAddress = billAddress;
        this.shipAddress = shipAddress;
        this.phoneNumber = phoneNumber;
        this.paymentMethod = paymentMethod;
    }

    @Bindable
    public long getShopperId() {
        return shopperId;
    }

    public void setShopperId(long shopperId) {
        this.shopperId = shopperId;
        notifyPropertyChanged(BR.shopperId);
    }

    @Bindable
    public String getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress;
        notifyPropertyChanged(BR.billAddress);
    }

    @Bindable
    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
        notifyPropertyChanged(BR.shipAddress);
    }

    @Bindable
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        notifyPropertyChanged(BR.phoneNumber);
    }

    @Bindable
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        notifyPropertyChanged(BR.paymentMethod);
    }
}

package com.thadocizn.myapplication.model;

import com.google.gson.annotations.SerializedName;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class Supplier extends BaseObservable {

    @SerializedName("supplier_id")
    private long supplierId;

    @SerializedName("name")
    private String name;

    public Supplier(long supplierId, String name) {
        this.supplierId = supplierId;
        this.name = name;
    }

    @Bindable
    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
        notifyPropertyChanged(BR.supplierId);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

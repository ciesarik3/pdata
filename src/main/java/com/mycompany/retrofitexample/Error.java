package com.mycompany.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Error {

    @SerializedName("error")
    @Expose
    public String error;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("error", error).toString();
    }
}

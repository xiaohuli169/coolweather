package com.eascs.coolweather.model;

/**
 * Created by rockjp on 8/5/16.
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        provinceName = provinceName;
    }

    public void setProvinceCode(String provinceCode) {
        provinceCode = provinceCode;
    }
}

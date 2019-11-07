package com.kons.bean;

public class OEmployeInfo extends Person{
    private OuterEmploye employeInfo;

    public OuterEmploye getEmployeInfo() {
        return employeInfo;
    }

    public void setEmployeInfo(OuterEmploye employeInfo) {
        this.employeInfo = employeInfo;
    }
}

package com.kons.bean;

public class IEmployeInfo extends Person{
    private InnerEmploye employeInfo;

    public InnerEmploye getEmployeInfo() {
        return employeInfo;
    }

    public void setEmployeInfo(InnerEmploye employeInfo) {
        this.employeInfo = employeInfo;
    }
}

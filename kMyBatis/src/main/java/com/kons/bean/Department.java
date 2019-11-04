package com.kons.bean;

import java.util.List;

public class Department {
    private int id;
    private String department_name;
    private String department_code;
    private String department_addr;
    private List<Employe> employes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDepartment_code() {
        return department_code;
    }

    public void setDepartment_code(String department_code) {
        this.department_code = department_code;
    }

    public String getDepartment_addr() {
        return department_addr;
    }

    public void setDepartment_addr(String department_addr) {
        this.department_addr = department_addr;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
}

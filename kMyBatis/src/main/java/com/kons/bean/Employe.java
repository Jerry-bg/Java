package com.kons.bean;

public class Employe {
    private int id;
    private String employe_name;
    private String employe_code;
    private String employe_phone;
    private String department_code;

    private Department department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmploye_name() {
        return employe_name;
    }

    public void setEmploye_name(String employe_name) {
        this.employe_name = employe_name;
    }

    public String getEmploye_code() {
        return employe_code;
    }

    public void setEmploye_code(String employe_code) {
        this.employe_code = employe_code;
    }

    public String getEmploye_phone() {
        return employe_phone;
    }

    public void setEmploye_phone(String employe_phone) {
        this.employe_phone = employe_phone;
    }

    public String getDepartment_code() {
        return department_code;
    }

    public void setDepartment_code(String department_code) {
        this.department_code = department_code;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employe:{"+employe_name+","+employe_code+","+department_code+","+employe_phone+"}";
    }
}

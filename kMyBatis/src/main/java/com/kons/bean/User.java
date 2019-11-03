package com.kons.bean;

public class User {
    private int id;
    private int person_age;
    private String person_name;
    private String person_account;
    private String person_pwd;
    private String person_addr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerson_age() {
        return person_age;
    }

    public void setPerson_age(int person_age) {
        this.person_age = person_age;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getPerson_account() {
        return person_account;
    }

    public void setPerson_account(String person_account) {
        this.person_account = person_account;
    }

    public String getPerson_pwd() {
        return person_pwd;
    }

    public void setPerson_pwd(String person_pwd) {
        this.person_pwd = person_pwd;
    }

    public String getPerson_addr() {
        return person_addr;
    }

    public void setPerson_addr(String person_addr) {
        this.person_addr = person_addr;
    }
}

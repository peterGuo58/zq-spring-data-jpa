package com.springboot.zqspringdatajpa.domain;

public class Userweb {
    private String name;
    private int age;
    private String pass;

    public Userweb(String name, int age, String pass) {
        this.name = name;
        this.age = age;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return ("name=" + this.name + ",age=" + this.age + ",pass=" + this.pass);
    }
}

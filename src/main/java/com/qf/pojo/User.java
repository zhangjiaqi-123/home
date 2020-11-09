package com.qf.pojo;

public class User {
    private Integer id;
    private String name;
    private String pass;
    private String sex;
    private String email;

    public User(Integer id, String name, String pass, String sex, String email) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.sex = sex;
        this.email = email;
    }

    public User(String name, String pass, String sex, String email) {
        this.name = name;
        this.pass = pass;
        this.sex = sex;
        this.email = email;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

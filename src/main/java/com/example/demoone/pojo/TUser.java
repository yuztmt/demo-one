package com.example.demoone.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class TUser implements Serializable{
    private String user_code;
    private String user_name;
    private String gender;
    private String phone;
    private String password;
    private String create_code;
    private Timestamp create_time;
    private String update_code;
    private Timestamp update_time;

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreate_code() {
        return create_code;
    }

    public void setCreate_code(String create_code) {
        this.create_code = create_code;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_code() {
        return update_code;
    }

    public void setUpdate_code(String update_code) {
        this.update_code = update_code;
    }

    public Timestamp getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Timestamp update_time) {
        this.update_time = update_time;
    }
}

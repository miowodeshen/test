package com.lab;

public class Admin extends Member {
    public Admin() {
    }

    public Admin(String name, int id) {
        super(name, id);
    }

    public String getRole(){
        return "管理员";
    }
}

package com.lab;

public class Teacher extends Member {
    public Teacher() {
    }

    public Teacher(String name, int id) {
        super(name, id);
    }

    @Override
    public String getRole() {
        return "教师";
    }
}

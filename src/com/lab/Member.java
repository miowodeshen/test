package com.lab;

public abstract class Member {
    private String name;
    private int id;

    public Member() {
    }

    public Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract String getRole();
    public void viewProfile(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Role: " + getRole());
    }
    public void editProfile(String newName,int newId){
        this.name = newName;
        this.id = newId;
    }
}

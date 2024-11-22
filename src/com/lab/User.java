package com.lab;

import java.util.Scanner;

public class User extends Member implements LabFunctions{
    int seat;
    public User() {
    }

    public User(String name, int id) {
        super(name, id);
    }


    @Override
    public void signUpLab() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("欢迎使用实验室报名系统！");
//        System.out.println("请依次输入您的名字和ID");
//        System.out.print("名字：");
//        setName(sc.nextLine());
//        System.out.print("ID: ");
//        setId(sc.nextInt());
        System.out.print("ID:"+getId()+"的用户 "+getName()+" 已成功报名实验室！");
    }
    @Override
    public void viewProfile(){
        super.viewProfile();
    }
    @Override
    public String getRole() {
        return "用户";
    }

}

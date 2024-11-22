package com.lab;

import java.util.Scanner;

public class Student extends Member implements LabFunctions {
    int seat;
    public Student() {
    }

    public Student(String name, int id) {
        super(name, id);
    }

    @Override
    public void signUpLab(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("欢迎使用实验室报名系统！");
//        System.out.println("请依次输入您的名字和ID");
//        System.out.print("名字：");
//        String name = sc.nextLine();
//        System.out.print("ID: ");
//        int id = sc.nextInt();
//        Student student = new Student(name, id);
        System.out.print("ID:"+getId()+"的学生 "+getName()+" 已成功报名实验室！");
    }
    @Override
    public void viewProfile(){
        super.viewProfile();
    }
    @Override
    public String getRole() {
        return "学生";
    }
}

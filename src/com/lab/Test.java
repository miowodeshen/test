package com.lab;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lab lab = new Lab();
        Student s1 = new Student("张三",10023);
        Student s2 = new Student("李四",10024);
        Student s3 = new Student("王五",10025);
        User u1=new User("Jack",13151);
        User u2=new User("Bunny",13152);
        User u3=new User("John",13153);
        lab.addMember(s1);
        lab.addMember(s2);
        lab.addMember(s3);
        lab.addMember(u1);
        lab.addMember(u2);
        lab.addMember(u3);
        boolean flag=true;
        int choice;
        while(flag){
            System.out.println("-----欢迎来到实验室报名系统-----");
            System.out.println("1：报名 2：查阅个人信息 3：退出 4：为实验室人员安排座位");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    signUp(lab);
                    break;
                case 2:
                    viewProfile(lab);
                    break;
                case 3:
                    System.out.println("感谢使用实验室系统，即将退出。");
                    flag=false;
                    break;
                case 4:

            }
        }
    }
    public static void signUp(Lab lab){
        //注册功能，将学生或者用户添加到lab类中的list中
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的名字：");
        String name = sc.next();
        System.out.println("请输入您的ID：");
        int id = sc.nextInt();
        System.out.println("请选择您注册的身份（1：用户 2：学生）");
        int choice = sc.nextInt();
        if (choice == 1){
            Student newStudent = new Student(name,id);
            lab.addMember(newStudent);
        }
        else if (choice == 2){
            User newUser = new User(name,id);
            lab.addMember(newUser);
        }
        else{
            System.out.println("输入的选项不在注册范围中，输入无效。");
        }
    }
    public static void viewProfile(Lab lab){
        //根据ID查阅个人信息并调用viewProfile方法打印个人信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想查阅的个人信息，请提供您的ID:");
        int id = sc.nextInt();
        for(int i=0;i<lab.list.size();i++){
            if(lab.list.get(i).getId()==id){
                System.out.println("已查阅到ID为 "+lab.list.get(i).getId()+" 的个人信息，即将为您打印。。。");
                lab.list.get(i).viewProfile();
                return;
            }
        }
        System.out.println("未查询到ID："+id+"的个人信息，请检查输入是否有误！");
    }

}

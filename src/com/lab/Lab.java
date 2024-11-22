package com.lab;

import java.util.ArrayList;
import java.util.Collections;

public class Lab {
    ArrayList<Member> list=new ArrayList<>();
    public void addMember(Member member){
        list.add(member);
        System.out.println("已成功添加 "+member.getRole()+" "+member.getName()+" ID:"+member.getId());
        System.out.println("注册成功！");
    }
    public void assignSeats(ArrayList<Member> members){

    }
}

package org.hbrs.se1.ws26.exercises.uebung2;

import java.util.ArrayList;

public class Container {
    ArrayList<Member> members;

    public Container(){
        members = new ArrayList<>();
    }

    public void  addMember(Member member) throws ContainerException{
        if(member == null){
            throw new NullPointerException("Member must not be null");
        }
        if(members.contains(member)){
            throw new ContainerException(member.getID());
        } else {
            members.add(member);
        }
    }

    public void deleteMember(Member member){
        if(member == null){
            throw new NullPointerException("Member must not be null");
        } else {
            members.remove(member);
        }
    }

    public void dump(){
        for(Member member : members){
            System.out.println(member.toString());
        }
    }

    public int size(){
        return members.size();
    }
}

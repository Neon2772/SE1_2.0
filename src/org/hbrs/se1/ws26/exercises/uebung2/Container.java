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

    public String deleteMember(Member member){
        if(member == null){
            throw new NullPointerException("Member must not be null");
        } else if(this.members.contains(member)){
            members.remove(member);
            return "Member mit der ID " +  member.getID() + " wurde gelöscht!";
        } else {
            System.out.println(member.getID() + " ist nicht Teil der Liste!");
            return "Member mit der ID " + member.getID() + " ist nicht Teil der Liste!";
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

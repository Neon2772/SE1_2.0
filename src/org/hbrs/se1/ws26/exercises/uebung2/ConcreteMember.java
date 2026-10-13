package org.hbrs.se1.ws26.exercises.uebung2;

public class ConcreteMember implements Member {
    private static int nextID = 0;
    private int id;

    public ConcreteMember(){
        id = nextID++;
    }

    @Override
    public Integer getID() {
        return this.id;
    }

    @Override
    public String toString(){
        return "Member (ID = " + this.id + ")";
    }
}

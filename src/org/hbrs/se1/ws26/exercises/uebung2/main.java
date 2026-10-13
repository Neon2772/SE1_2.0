package org.hbrs.se1.ws26.exercises.uebung2;

public class main {

    public static void main(String[] args) {

        ConcreteMember m1 = new ConcreteMember();
        ConcreteMember m2 = new ConcreteMember();

        Container cont = new Container();

        try {
            cont.addMember(m1);
            cont.addMember(m2);
        } catch (Exception e) {
            System.out.println("Fehler");
        }

        cont.dump();
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        cont.size();

    }
}

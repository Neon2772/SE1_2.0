package org.hbrs.se1.ws26.exercises.uebung3.persistence;

import java.util.ArrayList;

public class Container {
    private ArrayList<Member> members;
    // Singleton Pattern, um immer nur eine Instanz dieser Klasse zu haben
    // Dadurch würden alle Klassen, die einen Container nutzen, auf den SELBEN Container zugreifen
    private PersistenceStrategy<Member> strategy;
    // Der eine Container wird zur Klassen-Variable und ist damit keine Instanz-Variable, also gibt es den Container
    // immer nur genau ein Mal!
    private static Container container = new Container();

    private Container(){
        members = new ArrayList<>();
    }

    public static Container getContainerInstance(){
        return container;
    }

    public void setPersistenceStrategy(PersistenceStrategy<Member> strategy) {
        this.strategy = strategy;
    }

    public void  addMember(Member member) throws ContainerException {
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

    public ArrayList<Member> getCurrentList(){
        return members;
    }

    public void store() throws PersistenceException {
        if (strategy == null) {
            throw new PersistenceException(
                    PersistenceException.ExceptionType.NoStrategyIsSet,
                    "No PersistenceStrategy is set!"
            );
        }
        strategy.save(members);
    }

    public void load() throws PersistenceException {
        if (strategy == null) {
            throw new PersistenceException(
                    PersistenceException.ExceptionType.NoStrategyIsSet,
                    "No PersistenceStrategy is set!"
            );
        }
        members = (ArrayList<Member>) strategy.load();
    }

    // Hilfsmethode zum Testen
    public void deleteAllMembers() {
        members.clear();
    }
}

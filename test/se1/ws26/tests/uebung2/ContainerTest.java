package se1.ws26.tests.uebung2;
import org.hbrs.se1.ws26.exercises.uebung2.ConcreteMember;
import org.hbrs.se1.ws26.exercises.uebung2.Container;
import org.hbrs.se1.ws26.exercises.uebung2.ContainerException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainerTest {

    Container c;

    @BeforeEach
    void setup(){
        c = new Container();
    }

    @Test
    void testZeroSize() {
        assertEquals(0, c.size());
    }

    @Test
    void testNullMember() throws ContainerException {
        assertThrows(NullPointerException.class, () -> c.addMember(null));
        assertEquals(0, c.size());
    }

    @Test
    void testAddOneMemberAndSize() throws ContainerException {
        ConcreteMember m1 = new ConcreteMember();
        c.addMember(m1);
        assertEquals(1, c.size());
        assertEquals("Member (ID = " + m1.getID() + ")", m1.toString());
    }

    @Test
    void testAddTwoMemberAndSize() throws ContainerException {
        ConcreteMember m1 = new ConcreteMember();
        ConcreteMember m2 = new ConcreteMember();
        c.addMember(m1);
        c.addMember(m2);
        assertEquals(2, c.size());
    }

    @Test
    void testAddAndDeleteMember() throws ContainerException {
        ConcreteMember m1 = new ConcreteMember();
        ConcreteMember m2 = new ConcreteMember();
        c.addMember(m1);
        c.addMember(m2);
        assertEquals(2, c.size());
        c.deleteMember(m1);
        assertEquals(1, c.size());
        c.deleteMember(m2);
        assertEquals(0, c.size());
    }

    @Test
    void testIndependentContainer() throws ContainerException {
        Container c1 = new Container();
        Container c2 = new Container();

        ConcreteMember m1 = new ConcreteMember();
        ConcreteMember m2 = new ConcreteMember();

        c1.addMember(m1);
        c2.addMember(m2);
        assertEquals(1, c1.size());
        assertEquals(1, c2.size());
    }

    @Test
    void testAddMemberTwice() throws ContainerException {
        ConcreteMember m1 = new ConcreteMember();
        c.addMember(m1);
        assertThrows(ContainerException.class, () -> c.addMember(m1));
    }
}

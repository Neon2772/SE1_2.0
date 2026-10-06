package se1.ws26.tests.uebung1;

import org.hbrs.se1.ws26.exercises.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GermanTranslatorTest {

    @Test
    public void aTest() {
        GermanTranslator translator = new GermanTranslator();

        assertEquals("Ungültige Zahl!" , translator.translateNumber(0));
        assertEquals("eins" , translator.translateNumber(1));
        assertEquals("sechsundsechzig" ,  translator.translateNumber(66));
        assertEquals("hundert" ,  translator.translateNumber(100));
        assertEquals("zwölf" ,  translator.translateNumber(12));
        assertEquals("zweiundvierzig" ,  translator.translateNumber(42));
        assertEquals("dreißg" ,  translator.translateNumber(30));
        assertEquals("sechsundzwanzig" ,  translator.translateNumber(26));
        assertEquals("siebzehn" ,  translator.translateNumber(17));
        assertEquals("zwanzig" ,  translator.translateNumber(20));
        assertEquals("achtzehn" ,  translator.translateNumber(18));
        assertEquals("vierzehn" ,  translator.translateNumber(14));
        assertEquals("Ungültige Zahl!" ,  translator.translateNumber(-1));
        assertEquals("Ungültige Zahl!" ,  translator.translateNumber(101));
    }

    /*
    Was ist der Vorteil einer separaten Test-Klasse?
    Eine separate Test-Klasse trennt Testcode vom eigentlichen Produktivcode.
    Dadurch bleibt der Programmcode übersichtlich und die Tests können unabhängig vom Programm entwickelt und ausgeführt werden.
    Außerdem können mehrere Tests für eine Klasse gesammelt und strukturiert verwaltet werden.

    Was ist bei einem Blackbox-Test der Sinn von Äquivalenzklassen?
    Äquivalenzklassen teilen die möglichen Eingabewerte in Gruppen ein, bei denen man erwartet, dass sie sich gleich verhalten.
    Dadurch muss man nicht jeden möglichen Wert testen, sondern kann repräsentative Werte aus jeder Klasse auswählen und
    mit wenigen Tests trotzdem eine gute Abdeckung erreichen.

    Warum ist ein Blackbox-Test mit JUnit auf der Klasse Client nicht unmittelbar durchführbar?
    Weil ein Blackbox-Test nur die öffentliche Schnittstelle bzw. das beobachtbare Verhalten der Klasse testen soll.
    Wenn Client beispielsweise von anderen Klassen, Objekten oder einer bestimmten Umgebung abhängig ist,
    kann man sie nicht einfach isoliert mit JUnit testen. Diese Abhängigkeiten müssen zunächst bereitgestellt
    bzw. simuliert werden.
    */

}
package org.hbrs.se1.ws26.exercises.uebung1.control;

public class ConcreteCreator extends Creator {
    @Override
    public Translator factoryMethod() {
        GermanTranslator gT = new GermanTranslator();
        return gT;
    }
}

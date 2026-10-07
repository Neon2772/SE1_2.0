package org.hbrs.se1.ws26.exercises.uebung1.control;

public class GermanTranslatorFactory extends TranslatorFactory {
    @Override
    public Translator factoryMethod() {
        return new GermanTranslator();
    }
}

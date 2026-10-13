package org.hbrs.se1.ws26.exercises.uebung1.control;

public class GermanTranslatorFactory extends TranslatorFactory {
    @Override
    public Translator createTranslator() {
        return new GermanTranslator();
    }
}

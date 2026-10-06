package org.hbrs.se1.ws26.exercises.uebung1.control;

public class TranslatorFactory {

    public static Translator createTranslator() {
        Translator translator = new GermanTranslator();
        return translator;
    }
}

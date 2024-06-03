package com.example.common;

public class Phrase {
    private String phrase;
    private String definition;

    public Phrase(String phrase, String definition) {
        this.phrase = phrase;
        this.definition = definition;
    }

    public String getPhrase() {
        return phrase;
    }

    public String getDefinition() {
        return definition;
    }
}

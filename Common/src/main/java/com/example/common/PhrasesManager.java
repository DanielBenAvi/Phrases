package com.example.common;

import android.content.Context;

import java.util.ArrayList;

public class PhrasesManager {
    private final ArrayList<Phrase> phrases;
    private int currentPhraseIndex;

    private int score;

    private final CommonDataManager dataManager;


    public PhrasesManager(CommonDataManager dataManager, String SharedPreferenceName, Context context) {
        phrases = dataManager.getPhrases();
        this.dataManager = dataManager;
        currentPhraseIndex = 0;

        // Load the score from the shared preferences
        score = dataManager.getScore(SharedPreferenceName, context);
    }

    public void increaseScore() {
        score++;
    }

    public void generateNewPhrase() {

        currentPhraseIndex = (int) (Math.random() * phrases.size());
    }

    public String getCurrentPhrase() {
        return phrases.get(currentPhraseIndex).getPhrase();
    }

    public String getCurrentDefinition() {
        return phrases.get(currentPhraseIndex).getDefinition();
    }

    public int getScore() {
        return score;
    }

    public void saveScore(String sharedPreferenceName, Context applicationContext) {
        dataManager.saveScore(sharedPreferenceName, score, applicationContext);
    }
}

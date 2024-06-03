package com.example.common;

import android.content.Context;

import java.util.ArrayList;

public abstract class CommonDataManager {
    public abstract ArrayList<Phrase> getPhrases();

    public abstract int getScore(String SharedPreferenceName, Context context);

    public abstract void saveScore(String SharedPreferenceName, int score, Context context);
}

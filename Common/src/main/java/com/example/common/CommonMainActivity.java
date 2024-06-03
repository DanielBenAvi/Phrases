package com.example.common;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import java.text.MessageFormat;

public class CommonMainActivity extends AppCompatActivity {


    TextView appTitle;
    TextView phrase;
    TextView definition;

    TextView score;

    LinearLayout definition_layout;

    MaterialButton yes_button;
    MaterialButton no_button;

    PhrasesManager manager;

    protected CommonDataManager dataManager;
    protected String SharedPreferenceName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appTitle = findViewById(R.id.app_title);
        phrase = findViewById(R.id.phrase);
        definition = findViewById(R.id.definition);
        definition_layout = findViewById(R.id.definition_layout);
        yes_button = findViewById(R.id.yes_button);
        no_button = findViewById(R.id.no_button);
        score = findViewById(R.id.score);

        phrase.setOnClickListener(this::onPhraseClick);
        yes_button.setOnClickListener(view -> onDefinitionClick(true));
        no_button.setOnClickListener(view -> onDefinitionClick(false));

        manager = new PhrasesManager(dataManager, SharedPreferenceName, getApplicationContext());
        updateScoreText();
        generateNewPhrase();
    }


    public void onPhraseClick(View view) {
        phrase.setVisibility(View.GONE);
        definition_layout.setVisibility(View.VISIBLE);
    }

    public void onDefinitionClick(boolean isYesButton) {
        if (isYesButton) {
            manager.increaseScore();
            updateScoreText();
            manager.saveScore(SharedPreferenceName, getApplicationContext());
        }

        definition_layout.setVisibility(View.GONE);
        phrase.setVisibility(View.VISIBLE);

        generateNewPhrase();
    }

    private void updateScoreText() {
        score.setText(MessageFormat.format("Score: {0}", manager.getScore()));
    }


    public void generateNewPhrase() {
        manager.generateNewPhrase();
        phrase.setText(manager.getCurrentPhrase());
        definition.setText(manager.getCurrentDefinition());
    }


}
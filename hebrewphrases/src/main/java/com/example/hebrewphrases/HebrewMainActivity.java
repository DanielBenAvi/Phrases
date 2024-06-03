package com.example.hebrewphrases;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.common.CommonMainActivity;

public class HebrewMainActivity extends CommonMainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Hebrew", "onCreate: Hebrew Phrases");
        dataManager = new HebrewDataManager();
        SharedPreferenceName = "HebrewPhrases";
        super.onCreate(savedInstanceState);
    }
}
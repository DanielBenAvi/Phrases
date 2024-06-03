package com.example.phrases;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.common.CommonMainActivity;

public class MainActivity extends CommonMainActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("English", "onCreate: English Phrases");
        dataManager = new EnglishDataManager();
        SharedPreferenceName = "EnglishPhrases";
        super.onCreate(savedInstanceState);
    }
}
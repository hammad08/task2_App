package com.example.color_recognizer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    String text;
    int colorId;
    TextView textView;
    ConstraintLayout bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        getSupportActionBar().hide();
        text= getIntent().getStringExtra("Text");
        colorId= getIntent().getIntExtra("ColorID",0);
        textView = findViewById(R.id.textView4);
        textView.setText(text);
        textView.setTextColor(getResources().getColor(R.color.white));
        bg = findViewById(R.id.bg);
        bg.setBackgroundColor(getResources().getColor(colorId));
    }
}
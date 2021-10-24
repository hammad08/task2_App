package com.example.color_recognizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ApplicationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.application);
        getSupportActionBar().hide();
    }

    public void black_clk(View view) {
        Intent intent = new Intent(ApplicationActivity.this,ResultActivity.class);
        intent.putExtra("Text","This is Black Color.");
        intent.putExtra("ColorID",R.color.black);
        startActivity(intent);
    }

    public void gray_clk(View view) {
        Intent intent = new Intent(ApplicationActivity.this,ResultActivity.class);
        intent.putExtra("Text","This is Gray Color.");
        intent.putExtra("ColorID",R.color.gray);
        startActivity(intent);
    }

    public void red_clk(View view) {
        Intent intent = new Intent(ApplicationActivity.this,ResultActivity.class);
        intent.putExtra("Text","This is Red Color.");
        intent.putExtra("ColorID",R.color.red);
        startActivity(intent);
    }

    public void yellow_clk(View view) {
        Intent intent = new Intent(ApplicationActivity.this,ResultActivity.class);
        intent.putExtra("Text","This is Yellow Color.");
        intent.putExtra("ColorID",R.color.yellow);
        startActivity(intent);
    }

    public void blue_clk(View view) {
        Intent intent = new Intent(ApplicationActivity.this,ResultActivity.class);
        intent.putExtra("Text","This is Blue Color.");
        intent.putExtra("ColorID",R.color.blue);
        startActivity(intent);
    }

    public void green_clk(View view) {
        Intent intent = new Intent(ApplicationActivity.this,ResultActivity.class);
        intent.putExtra("Text","This is Green Color.");
        intent.putExtra("ColorID",R.color.green);
        startActivity(intent);
    }

    public void orange_clk(View view) {
        Intent intent = new Intent(ApplicationActivity.this,ResultActivity.class);
        intent.putExtra("Text","This is Orange Color.");
        intent.putExtra("ColorID",R.color.orange);
        startActivity(intent);
    }

    public void purple_clk(View view) {
        Intent intent = new Intent(ApplicationActivity.this,ResultActivity.class);
        intent.putExtra("Text","This is Purple Color.");
        intent.putExtra("ColorID",R.color.purple);
        startActivity(intent);
    }

    public void pink_clk(View view) {
        Intent intent = new Intent(ApplicationActivity.this,ResultActivity.class);
        intent.putExtra("Text","This is Pink Color.");
        intent.putExtra("ColorID",R.color.pink);
        startActivity(intent);
    }

    public void parrot_clk(View view) {
        Intent intent = new Intent(ApplicationActivity.this,ResultActivity.class);
        intent.putExtra("Text","This is Parrot Color.");
        intent.putExtra("ColorID",R.color.parrot);
        startActivity(intent);
    }

    public void darkB_clk(View view) {
        Intent intent = new Intent(ApplicationActivity.this,ResultActivity.class);
        intent.putExtra("Text","This is Dark Blue Color.");
        intent.putExtra("ColorID",R.color.dark_blue);
        startActivity(intent);
    }

    public void brown_clk(View view) {
        Intent intent = new Intent(ApplicationActivity.this,ResultActivity.class);
        intent.putExtra("Text","This is Brown Color.");
        intent.putExtra("ColorID",R.color.brown);
        startActivity(intent);
    }
}
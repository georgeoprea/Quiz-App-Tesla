package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.quizapp.R.id.number;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        int score = 0;
        //1st Question
        CheckBox first = (CheckBox) findViewById(R.id.Tesla1);
        CheckBox second = (CheckBox) findViewById(R.id.SpaceX1);
        CheckBox third = (CheckBox) findViewById(R.id.PayPal1);
        if (first.isChecked() && second.isChecked() && third.isChecked()) score++;

        //2nd Question
        if (((RadioButton) findViewById(R.id.Musk2)).isChecked()) score++;

        //3rd Question
        if (((RadioButton) findViewById(R.id.PayPal3)).isChecked()) score++;

        //4th Question
        TextView ans = (TextView) findViewById(number);
        String answer = ans.getText().toString();
        if (answer.equals("3")) score++;

        //5th Question
        if (((RadioButton) findViewById(R.id.Model3)).isChecked()) score++;

        //6th Question
        if (((RadioButton) findViewById(R.id.Mars)).isChecked()) score++;

        dispalyScore(score);
    }

    private void dispalyScore(int score) {
        Toast.makeText(this, "Score: " + score + "/6", Toast.LENGTH_SHORT).show();
    }
}

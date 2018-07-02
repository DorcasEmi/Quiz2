package com.example.dorcasemiewo.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class ScoreActivity extends AppCompatActivity {
    TextView scoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Intent mIntent = getIntent();
        int q1 = mIntent.getIntExtra("QuestionFour", 0);

        scoreView = findViewById(R.id.scoreTextView);

        scoreView.setText(String.valueOf(q1));

        Toast.makeText(this, "ur final score is " + q1, Toast.LENGTH_SHORT).show();
    }
}

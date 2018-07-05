package com.example.dorcasemiewo.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Start(View view) {
        Intent startQuiz = new Intent(MainActivity.this, QuestionTwo.class);
        startActivity(startQuiz);

    }
}

package com.example.dorcasemiewo.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class QuestionFive extends AppCompatActivity {
    CheckBox one, two, three, four, five, six, seven;
    int scoreQuestionFour = 5;
 int intValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_five);

        one = findViewById(R.id.check1);
        two = findViewById(R.id.check2);
        three = findViewById(R.id.check3);
        four = findViewById(R.id.check4);
        five = findViewById(R.id.check5);
        six = findViewById(R.id.check6);
        seven = findViewById(R.id.check7);

        Intent mIntent = getIntent();
        intValue = mIntent.getIntExtra("QuestionThree", 0);
        Toast.makeText(this, "Your previous score was " + intValue, Toast.LENGTH_SHORT).show();
    }

    public void Submit(View view) {
        if (one.isChecked() || two.isChecked() || three.isChecked() || four.isChecked()) {
//            scoreQuestionFour = scoreQuestionFour + 5;
            int total23 = intValue + scoreQuestionFour;
            Toast.makeText(QuestionFive.this, "Your score is " + total23, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(QuestionFive.this, ScoreActivity.class);
            intent.putExtra("QuestionFour", total23);
            startActivity(intent);
        } else {

        }


    }
}

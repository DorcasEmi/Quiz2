package com.example.dorcasemiewo.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuestionFour extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton questionThreeAnswer;
    int scoreQuestionThree = 5;
    Button next;
    int radioBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four);

        Intent mIntent = getIntent();
        final int intValue = mIntent.getIntExtra("QuestionTwo", 0);
        Toast.makeText(this, "Your previous score was " + intValue, Toast.LENGTH_SHORT).show();
        radioGroup = findViewById(R.id.radio_group_question_three);
        next = findViewById(R.id.nextButton3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioBut = radioGroup.getCheckedRadioButtonId();
                if (radioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(QuestionFour.this, "Please select an option;", Toast.LENGTH_SHORT).show();
                } else {
                    if (radioBut == R.id.ans2) {
                        int total23 = intValue + scoreQuestionThree;
                        Toast.makeText(QuestionFour.this, "Your score is " + total23, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(QuestionFour.this, QuestionFive.class);
                        intent.putExtra("QuestionThree", total23);
                        startActivity(intent);

                    } else {
                       // Toast.makeText(QuestionFour.this, "you selected a wrong answer", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
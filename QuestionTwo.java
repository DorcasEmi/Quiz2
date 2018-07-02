package com.example.dorcasemiewo.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuestionTwo extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton questionOneAnswer;
    RadioButton questionTwoAnswer;
    int scoreQuestionONe = 5;
    Button next;
    int radioBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);

        radioGroup = findViewById(R.id.radio_group_question_one);
        next = findViewById(R.id.nextButton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioBut = radioGroup.getCheckedRadioButtonId();
                if (radioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(QuestionTwo.this, "Please select an option;", Toast.LENGTH_SHORT).show();
                } else {
                    if (radioBut == R.id.option2Q1) {
                        Toast.makeText(QuestionTwo.this, "Your score is " + scoreQuestionONe, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(QuestionTwo.this, QuestionThree.class);
                        intent.putExtra("QuestionOne", scoreQuestionONe);
                        startActivity(intent);

                    } else {
//                        Toast.makeText(QuestionTwo.this, "you selected a wrong answer", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
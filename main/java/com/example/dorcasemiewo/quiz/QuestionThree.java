package com.example.dorcasemiewo.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuestionThree extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton questionTwoAnswer;
    int scoreQuestionTwo = 5;
    Button next;
    int radioBut;
    boolean isChecked = false;
    int intValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);

        radioGroup = findViewById(R.id.radio_group_question_two);

        Intent mIntent = getIntent();
        intValue = mIntent.getIntExtra("QuestionOne", 0);
        Toast.makeText(this, "Your previous score was " + intValue, Toast.LENGTH_SHORT).show();

        next = findViewById(R.id.nextButton2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioBut = radioGroup.getCheckedRadioButtonId();
                if (radioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(QuestionThree.this, "Please select an option;", Toast.LENGTH_SHORT).show();
                } else {
                    if (radioBut == R.id.qr3) {
                        int total12 = intValue + scoreQuestionTwo;
                        Toast.makeText(QuestionThree.this, "Your score is " + total12, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(QuestionThree.this, QuestionFour.class);
                        intent.putExtra("QuestionTwo", total12);
                        startActivity(intent);

                    } else {
                        //Toast.makeText(QuestionThree.this, "you selected a wrong answer", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
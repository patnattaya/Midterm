package com.example.hp.midterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText NameEditText, ScoreEditText;
    private Button FindButton, ExitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NameEditText = (EditText)findViewById(R.id.name_edit_text);
        ScoreEditText = (EditText)findViewById(R.id.score_edit_text);
        FindButton = (Button)findViewById(R.id.find_button);
        ExitButton = (Button)findViewById(R.id.exit_button);

        FindButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int score = 0;
                String scoreText = getScoreText(score);
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                
                startActivity(intent);
            }
            private String getScoreText(int score) {

                String scoreText = "";

                if(score > 80){
                    scoreText = "A";
                }else if(score >=70){
                    scoreText = "B";
                }else if(score >=60){
                    scoreText = "C";
                }else if(score >=50){
                    scoreText = "D";
                }
                else{
                    scoreText = "F";
                }
                return scoreText;
            }



        });
    }
}

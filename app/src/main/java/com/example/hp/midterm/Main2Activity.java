package com.example.hp.midterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();




    }
    public void Back(View v){
        Intent i = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(i);
    }
    public void Close() {finish();}
}
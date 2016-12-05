package com.example.student1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CheatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
    }
    public void Back(View v){
        Intent i=new Intent(CheatActivity.this,MainActivity.class);
        startActivity(i);
    }
}

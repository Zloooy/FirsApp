package com.example.student1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        TextView ans=(TextView)findViewById(R.id.answer);
        ans.setText(getIntent().getBooleanExtra("ans",false)+"");
    }
    public void Back(View v){
        Intent i=new Intent(CheatActivity.this,MainActivity.class);
        i.putExtra("cheated",true);
        startActivity(i);
    }
}

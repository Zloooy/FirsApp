package com.example.student1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int n=0;
    Question[] quest=new Question[]{new Question("Вы человек?"),new Question("Точно человек?")};
    private TextView edtext;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtext = (TextView)findViewById(R.id.tw);
    }

    public void onNext(View v){
        n++;
        edtext.setText(nextquest(n));
    }
    public void onLast(View v){
        n--;
        edtext.setText(nextquest(n));
    }
    public String nextquest(int n){
        return quest[n];
    }
}

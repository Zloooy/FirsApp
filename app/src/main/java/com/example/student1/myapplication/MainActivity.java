package com.example.student1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Question[] quest=new Question[]{new Question("Вы человек?",true),new Question("Точно человек?",true)};
    private TextView edtext;
    private int n;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        n=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtext = (TextView)findViewById(R.id.tw);
        updateUI();
    }
    public void updateUI(){
        edtext.setText(quest[n].getText());
    }
    public void onYes(View v) {
    Toast.makeText(getApplicationContext(),String.valueOf(quest[n].ask(true)),Toast.LENGTH_LONG).show();
    }
    public void onNo(View v) {
        Toast.makeText(getApplicationContext(),quest[n].ask(false)+"",Toast.LENGTH_SHORT).show();
    }
    public void onNext(View v){
        n--;
        updateUI();
    }
    public void onLast(View v){
        n++;
        updateUI();
    }
}

package com.example.student1.myapplication;

import android.content.Intent;
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
    private int len=quest.length;
    boolean chtd=false;
    TextView cheated;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        n=0;
        boolean chtd=getIntent().getBooleanExtra("cheated",false);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtext = (TextView)findViewById(R.id.tw);
        cheated = (TextView)findViewById(R.id.cheated);
        updateUI();
    }
    public void updateUI(){
        edtext.setText(quest[n].getText());
        cheated.setText(chtd?"CHEATED":"");
    }
    public void onYes(View v) {
    Toast.makeText(getApplicationContext(),String.valueOf(quest[n].ask(true)),Toast.LENGTH_LONG).show();
    }
    public void onNo(View v) {
        Toast.makeText(getApplicationContext(),quest[n].ask(false)+"",Toast.LENGTH_SHORT).show();
    }
    public void onNext(View v){
        n=nextn(-1);
        chtd=false;
        updateUI();
    }
    public void onLast(View v){
        n=nextn(-1);
        chtd=false;
        updateUI();
    }
    public void Cheat(View v){
        Intent i=new Intent(MainActivity.this,CheatActivity.class);
        i.putExtra("ans",quest[n].getAnswer());
        startActivity(i);
    }
    public int nextn(int dif){
        return (dif+n>=0?dif+n<len?dif+n:dif+n-len:len-dif-n-1);
    }
}

package com.example.student1.myapplication;
/**
 * Created by student1 on 30.11.16.
 */
public class Question {
    private String text;
    boolean answer;
    Question(String s){
        text=s;
    }
    String getText(){
        return text;
    }
    void yes(){
        answer=true;
    }
    void no(){
        answer=false;
    }
}
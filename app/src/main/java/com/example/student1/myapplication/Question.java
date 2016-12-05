package com.example.student1.myapplication;
/**
 * Created by student1 on 30.11.16.
 */
public class Question {
    private String text;
    boolean answer;
    Question(String s,boolean ans){
        text=s;
        answer=ans;
    }
    String getText(){
        return text;
    }
    boolean ask(boolean b){
        return b==answer;
    }
}
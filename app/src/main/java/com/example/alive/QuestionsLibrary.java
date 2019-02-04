package com.example.alive;

public class QuestionsLibrary {
    public String questionsDog[] = {"Text1","Text2","Text3","Text4","Text5","Text6","Text7","Text8"
    };

    public String nChoice [][]={
        {"Yes", "No"},{"Maybe", "Baby"},{"Oh","Good"},{"Please","NOO"},{"Jesus","Oh god"},{"Later", "Now"},{"Thank u","Next"},{"No probs", "Hell no"}
    };

    public String nCorrectAnswer[]={};

    public String getQuestion(int a){
        String question = questionsDog[a];
        return question;
    }
    public String getChoiceOne(int a){
        String choiceOne = nChoice[a][0];
        return choiceOne;
    }
    public String getChoiceTwo(int a){
        String choiceTwo = nChoice[a][1];
        return choiceTwo;
    }
    public int listCount(){
        int listCount = questionsDog.length;
        return listCount;
    }
}

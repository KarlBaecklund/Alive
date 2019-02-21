package com.example.alive;

public class QuestionsLibrary {
    public String questionsDog[] = {"Are we going out now?","Can i get a treat?","fido is trying to poop, what do you do?","12pm Fido still wants to play","Need to go work, should Fido come to?","Should we go for a morning walk?","Is fido a good dog? ","Should we go to the dog park today?"
    };

    public String nChoice [][]={
        {"Hell yeah", "No to cold"},{"Good dog", "Sry, you are to fluffy"},{"Let it go","Take fido outside"},{"Let’s play","Go to sleep "},{"Of course","Another day"},{"To tired", "Yes"},{"Hell yeah","Hell no"},{"Sure", "No"}
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

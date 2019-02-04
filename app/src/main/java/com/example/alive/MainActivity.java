package com.example.alive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private QuestionsLibrary questionsLibrary = new QuestionsLibrary();
    private int listNr = questionsLibrary.listCount();
    private  Random rand = new Random();
    private int rndNumber = rand.nextInt(listNr);
    private TextView textView;
    private TextView questionView;
    private Button buttonChoice1;
    private Button buttonChoice2;
    private int turnScore = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionView = (TextView)findViewById(R.id.dog_talk);
        buttonChoice1 = (Button) findViewById(R.id.button1);
        buttonChoice2 = (Button) findViewById(R.id.button2);




        buttonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                updateStat();
                updateQuestion();



            }
        });
        buttonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                updateStat();
                updateQuestion();

            }
        });



    }
    private void updateStat(){
        int stat1 = Integer.parseInt(getStat1());
        int stat2 = Integer.parseInt(getStat2());
        int stat3 = Integer.parseInt(getStat3());


        //int rndStatChoice = rand.nextInt(3)+1;
        //int rndChoice = rand.nextInt(2)+1;
        Toast toast = Toast.makeText(getApplicationContext(), String.valueOf(rndNumber), Toast.LENGTH_SHORT); toast.show();

        if (rndNumber == 0 || rndNumber == 1 || rndNumber == 2){
            stat1 -= 1;
            stat2 += 1;
            setStat1(stat1);
            setStat2(stat2);
        }
        else if (rndNumber == 3 || rndNumber == 4){
            stat1 += 1;
            stat3 -= 1;
            setStat1(stat1);
            setStat3(stat3);
        }
        else if (rndNumber == 5 || rndNumber == 6){
            stat3 += 1;
            stat2 -= 1;
            setStat3(stat3);
            setStat2(stat2);
        }
        else if (rndNumber == 7){
            stat1 -= 1;
            stat3 -= 1;
            stat2 += 1;
            setStat1(stat1);
            setStat3(stat3);
            setStat2(stat2);
        }
        dogDead(stat1,stat2,stat3);
        turnScore++;
        //rndNumber = rand.nextInt(listNr);
    }
    private void dogDead(int stat1, int stat2, int stat3){

        if(stat1 == 0 || stat2 == 0 || stat3 == 0){
            Toast toast = Toast.makeText(getApplicationContext(), "Dog is dead, survived: " + String.valueOf(turnScore)+ " turns", Toast.LENGTH_SHORT); toast.show();
            setStat1(5);
            setStat2(5);
            setStat3(5);
            turnScore = 0;
        }
        else{
            return;
        }
    }


    private void updateQuestion(){

        buttonChoice1.setText(questionsLibrary.getChoiceOne(rndNumber));
        buttonChoice2.setText(questionsLibrary.getChoiceTwo(rndNumber));
        questionView.setText(questionsLibrary.getQuestion(rndNumber));
        rndNumber = rand.nextInt(listNr);
    }

    public String getStat1(){
        textView =(TextView)findViewById(R.id.stat1);
        String text = textView.getText().toString();
        return text;
    }
    public String getStat2(){
        textView =(TextView)findViewById(R.id.stat2);
        String text = textView.getText().toString();
        return text;
    }
    public String getStat3(){
        textView =(TextView)findViewById(R.id.stat3);
        String text = textView.getText().toString();
        return text;
    }
    public void setStat1(int stat){
        String statChange = String.valueOf(stat);
        textView =(TextView)findViewById(R.id.stat1);
        textView.setText(statChange);
    }
    public void setStat2(int stat){
        String statChange = String.valueOf(stat);
        textView =(TextView)findViewById(R.id.stat2);
        textView.setText(statChange);
    }
    public void setStat3(int stat){
        String statChange = String.valueOf(stat);
        textView =(TextView)findViewById(R.id.stat3);
        textView.setText(statChange);
    }
}

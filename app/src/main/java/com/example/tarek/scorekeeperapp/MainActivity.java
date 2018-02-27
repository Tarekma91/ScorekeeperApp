package com.example.tarek.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA ;
    private int scoreTeamB ;
    private int foulsTeamA ;
    private int foulsTeamB ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniateScoreValue (); // set values as 0


        final TextView labelScoreTeamA = (TextView) findViewById(R.id.idScoreTeamA);
        final TextView labelFoulTeamA  = (TextView) findViewById(R.id.idFoulsTeamA);
        Button addGoalTeamA = (Button) findViewById(R.id.idAddGoalTeamA);
        Button addFoulTeamA = (Button) findViewById(R.id.idAddFoulTeamA);

        final TextView labelScoreTeamB = (TextView) findViewById(R.id.idScoreTeamB);
        final TextView labelFoulsTeamB  = (TextView) findViewById(R.id.idFoulsTeamB);
        Button addGoalTeamB = (Button) findViewById(R.id.idAddGoalTeamB);
        Button addFoulTeamB = (Button) findViewById(R.id.idAddFoulTeamB);

        Button reset = (Button) findViewById(R.id.idResetButton);

        //to increase team A score +1
        addGoalTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setScoreTeamA(getScoreTeamA()+1);
                labelScoreTeamA.setText(getScoreTeamA()+"");
            }
        });

        //to increase team A fouls +1
        addFoulTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFoulsTeamA(getFoulsTeamA()+1);
                labelFoulTeamA.setText(getFoulsTeamA()+"");
            }
        });


        //to increase team B score +1
        addGoalTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setScoreTeamB(getScoreTeamB()+1);
                labelScoreTeamB.setText(getScoreTeamB()+"");
            }
        });

        //to increase team B fouls +1
        addFoulTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFoulsTeamB(getFoulsTeamB()+1);
                labelFoulsTeamB.setText(getFoulsTeamB()+"");
            }
        });


        // to set all values to 0 as intial value and set it on labels as text
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniateScoreValue ();
                labelScoreTeamA.setText(getScoreTeamA()+"");
                labelScoreTeamB.setText(getScoreTeamB()+"");
                labelFoulTeamA.setText(getFoulsTeamA()+"");
                labelFoulsTeamB.setText(getFoulsTeamB()+"");
            }
        });

    }

    public void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    public int getScoreTeamA() {
        return scoreTeamA;

    }

    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }

    public int getScoreTeamB() {
        return scoreTeamB;
    }

    public void setFoulsTeamA(int foulsTeamA) {
        this.foulsTeamA = foulsTeamA;
    }

    public int getFoulsTeamA() {
        return foulsTeamA;
    }

    public void setFoulsTeamB(int foulsTeamB) {
        this.foulsTeamB = foulsTeamB;
    }

    public int getFoulsTeamB() {
        return foulsTeamB;
    }

    /**
     * to set scores and fouls to 0 as inital value in string.xml
     */
    public void iniateScoreValue (){
        scoreTeamA = Integer.parseInt(getString(R.string.initial_score)) ;
        scoreTeamB = Integer.parseInt(getString(R.string.initial_score)) ;
        foulsTeamA = Integer.parseInt(getString(R.string.initial_score)) ;
        foulsTeamB = Integer.parseInt(getString(R.string.initial_score)) ;
    }
}

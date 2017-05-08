package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int homeScore;
    int awayScore;

    int lastGamehome;
    int lastGameaway;

    int resumeHome;
    int resumeAway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayforhome(0);
        displayforaway(0);

    }

    public void displayforhome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayforaway(int score) {
        TextView scoreView = (TextView) findViewById(R.id.awayScore);
        scoreView.setText(String.valueOf(score));
    }

    public void homeThree(View view) {
        homeScore = homeScore + 3;
        displayforhome(homeScore);
    }

    public void homeTwo(View view) {
        homeScore = homeScore + 2;
        displayforhome(homeScore);
    }

    public void homeOne(View view) {
        homeScore = homeScore + 1;
        displayforhome(homeScore);
    }

    public void homeMinus(View view) {
        if (homeScore < 1)
            homeScore = 0;
        else
        homeScore = homeScore - 1;
        displayforhome(homeScore);
    }

    public void awayThree(View view) {
        awayScore = awayScore + 3;
        displayforaway(awayScore);
    }

    public void awayTwo(View view) {
        awayScore = awayScore + 2;
        displayforaway(awayScore);
    }

    public void awayOne(View view) {
        awayScore = awayScore + 1;
        displayforaway(awayScore);
    }

    public void awayMinus(View view) {
        if(awayScore < 1)
            awayScore = 0;
        else
        awayScore = awayScore - 1;
        displayforaway(awayScore);

    }
    public void reset (View view) {
        lastGameaway = awayScore;
        awayScore = 0;
        displayforaway(awayScore);

        lastGamehome = homeScore;
        homeScore = 0;
        displayforhome(homeScore);
    }
public void resume (View view){

    displayforhome(resumeHome);

    displayforaway(resumeAway);
}
    public void previous (View view){
        resumeHome = homeScore;
        displayforhome(lastGamehome);
        resumeAway = awayScore;
        displayforaway(lastGameaway);
    }
}
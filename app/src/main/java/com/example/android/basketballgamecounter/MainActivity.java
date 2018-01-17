package com.example.android.basketballgamecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreBulls = 0;
    int scoreLakers = 0;
    int timeOutBulls = 0;
    int timeOutLakers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForBulls (int score){
        TextView scoreView = (TextView) findViewById(R.id.score_bulls);
         scoreView.setText(String.valueOf(score));
    }

    public void displayForLakers (int score){
        TextView scoreView = (TextView) findViewById(R.id.score_lakers);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTimeOutForBulls (int score){
        TextView scoreView = (TextView) findViewById(R.id.timeout_scorebulls);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTimeOutForLakers (int score){
        TextView scoreView = (TextView) findViewById(R.id.timeout_scorelakers);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsToBulls (View view) {

        scoreBulls = scoreBulls + 3;
        displayForBulls(scoreBulls);
    }

    public void addThreePointsToLakers (View view) {

        scoreLakers = scoreLakers + 3;
        displayForLakers(scoreLakers);
    }

    public void addTwoPointsToBulls (View view) {

        scoreBulls = scoreBulls + 2;
        displayForBulls(scoreBulls);
    }

    public void addTwoPointsToLakers (View view) {

        scoreLakers = scoreLakers + 2;
        displayForLakers(scoreLakers);
    }

    public void addOnePointsToBulls (View view) {

        scoreBulls = scoreBulls + 1;
        displayForBulls(scoreBulls);
    }

    public void addOnePointsToLakers (View view) {

        scoreLakers = scoreLakers + 1;
        displayForLakers(scoreLakers);
    }

    public void addOneTimeOutOf60ToBulls (View view){
        timeOutBulls = timeOutBulls +1;
        displayTimeOutForBulls(timeOutBulls);
    }

    public void addOneTimeOutOf60ToLakers (View view){
        timeOutLakers = timeOutLakers +1;
        displayTimeOutForLakers(timeOutLakers);
    }

    public void addOneTimeOutOf20ToBulls (View view){
        timeOutBulls=timeOutBulls+1;
        displayTimeOutForBulls(timeOutBulls);
    }

    public void addOneTimeOutOf20ToLakers (View view){
        timeOutLakers=timeOutLakers+1;
        displayTimeOutForLakers(timeOutLakers);
    }

    public void resetTheGame (View view) {
        scoreBulls = 0;
        scoreLakers = 0;
        timeOutBulls = 0;
        timeOutLakers = 0;
        displayForBulls(scoreBulls);
        displayForLakers(scoreLakers);
        displayTimeOutForBulls(timeOutBulls);
        displayTimeOutForLakers(timeOutLakers);
    }


}

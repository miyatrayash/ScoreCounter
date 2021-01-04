package com.example.scorecounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    public void resetScore(View view) {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamB();
        displayForTeamA();
    }
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreForTeamA));
    }

    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreForTeamB));
    }

    public void addThreeForTeamA(View view) {
        scoreForTeamA += 3;
        displayForTeamA();
    }

    public void addThreeForTeamB(View view) {
        scoreForTeamB += 3;
        displayForTeamB();
    }

    public void addTwoForTeamA(View view) {
        scoreForTeamA += 2;
        displayForTeamA();
    }

    public void addTwoForTeamB(View view) {
        scoreForTeamB += 2;
        displayForTeamB();
    }

    public void addOneForTeamA(View view) {
        scoreForTeamA++;
        displayForTeamA();
    }

    public void addOneForTeamB(View view) {
        scoreForTeamB++;
        displayForTeamB();
    }
}
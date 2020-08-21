package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThree(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwo(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void addOne(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    public void decrement(View view) {
        scoreTeamA -= 1;
        displayForTeamA(scoreTeamA);
    }
    public void reset(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
    }
}
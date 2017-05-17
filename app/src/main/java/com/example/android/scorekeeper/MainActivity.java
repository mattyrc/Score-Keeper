package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreHomeTeam = 0;
    int scoreAwayTeam = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Add goal for Home team
    public void addGoalHomeTeam (View view) {
        scoreHomeTeam = scoreHomeTeam + 1;
        displayForHomeTeam(scoreHomeTeam);
    }

    // Take away goal for Home team
    public void subtractGoalHomeTeam (View view) {
        scoreHomeTeam = scoreHomeTeam - 1;
        // Keep goals from going negative
        if (scoreHomeTeam < 0) {
            scoreHomeTeam = 0;
        }
        displayForHomeTeam(scoreHomeTeam);
    }

    // Add goal for Away team
    public void addGoalAwayTeam (View view) {
        scoreAwayTeam = scoreAwayTeam + 1;
        displayForAwayTeam(scoreAwayTeam);
    }

    // Take away goal for Away team
    public void subtractGoalAwayTeam (View view) {
        scoreAwayTeam = scoreAwayTeam - 1;
        // Keep goals from going negative
        if (scoreAwayTeam < 0) {
            scoreAwayTeam = 0;
        }
        displayForAwayTeam(scoreAwayTeam);
    }

    // Display score for Home team
    public void displayForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }

    // Display score for Away team
    public void displayForAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(score));
    }
}

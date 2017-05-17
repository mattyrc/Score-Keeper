package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Initial values
    int scoreHomeTeam = 0;
    int scoreAwayTeam = 0;
    int currentPeriod = 1;
    private static final String otPeriod = "OT";
    // Crash when using line below to pull from strings.xml
    // String otPeriod = getString(R.string.ot_string);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Add goal for Home team
    public void addGoalHomeTeam(View view) {
        scoreHomeTeam = scoreHomeTeam + 1;
        // Keep goals from reaching triple digits
        if (scoreHomeTeam >= 100) {
            scoreHomeTeam = 99;
        }
        displayForHomeTeam(scoreHomeTeam);
    }

    // Take away goal for Home team
    public void subtractGoalHomeTeam(View view) {
        scoreHomeTeam = scoreHomeTeam - 1;
        // Keep goals from going negative
        if (scoreHomeTeam < 0) {
            scoreHomeTeam = 0;
        }
        displayForHomeTeam(scoreHomeTeam);
    }

    // Add goal for Away team
    public void addGoalAwayTeam(View view) {
        scoreAwayTeam = scoreAwayTeam + 1;
        // Keep goals from reaching triple digits
        if (scoreAwayTeam >= 100) {
            scoreAwayTeam = 99;
        }
        displayForAwayTeam(scoreAwayTeam);
    }

    // Take away goal for Away team
    public void subtractGoalAwayTeam(View view) {
        scoreAwayTeam = scoreAwayTeam - 1;
        // Keep goals from going negative
        if (scoreAwayTeam < 0) {
            scoreAwayTeam = 0;
        }
        displayForAwayTeam(scoreAwayTeam);
    }

    // Set first period button
    public void selectFirstPeriod(View view) {
        currentPeriod = 1;
        displayCurrentPeriod(currentPeriod);
    }

    // Set second period button
    public void selectSecondPeriod(View view) {
        currentPeriod = 2;
        displayCurrentPeriod(currentPeriod);
    }

    // Set third period button
    public void selectThirdPeriod(View view) {
        currentPeriod = 3;
        displayCurrentPeriod(currentPeriod);
    }

    // Set OT period button
    public void selectOTPeriod(View view) {
        displayOTPeriod(otPeriod);
    }

    // Reset game button
    public void resetGame(View view) {
        scoreHomeTeam = 0;
        scoreAwayTeam = 0;
        currentPeriod = 1;
        displayForHomeTeam(scoreHomeTeam);
        displayForAwayTeam(scoreAwayTeam);
        displayCurrentPeriod(currentPeriod);
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

    // Display current Period in game
    public void displayCurrentPeriod(int period) {
        TextView periodView = (TextView) findViewById(R.id.current_period);
        periodView.setText(String.valueOf(period));
    }

    // Display a string for OT
    public void displayOTPeriod(String period) {
        TextView periodView = (TextView) findViewById(R.id.current_period);
        periodView.setText(String.valueOf(period));
    }
}

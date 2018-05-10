package com.example.hiren.simplecricketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Keeps track of the score for team A.
    int RunsScoreTeamA = 0;
    int wicketsTeamA = 0;

    //Keeps track of the score for team B.
    int RunsScoreTeamB = 0;
    int wicketsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_runs_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given wicket score for Team A.
     */
    public void displayWicketForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_Wickets_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_runs_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given wicket score for Team B.
     */
    public void displayWicketForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_Wickets_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays and adds 6 to team A's Run score when +6 button is clicked
     */
    public void plusSixRunsForTeamA(View view) {
        RunsScoreTeamA = RunsScoreTeamA + 6;
        displayForTeamA(RunsScoreTeamA);
    }

    /**
     * This method displays and adds 4 to team A's  Run score when +4 button is clicked
     */
    public void plusFourRunsForTeamA(View view) {
        RunsScoreTeamA = RunsScoreTeamA + 4;
        displayForTeamA(RunsScoreTeamA);
    }

    /**
     * This method displays and adds 2 to team A's Runs score when +2 button is clicked
     */
    public void plusTwoRunsForTeamA(View view) {
        RunsScoreTeamA = RunsScoreTeamA + 2;
        displayForTeamA(RunsScoreTeamA);
    }

    /**
     * This method displays and adds 1 to team A's Runs score when +1 button is clicked
     */
    public void plusOneRunsForTeamA(View view) {
        RunsScoreTeamA = RunsScoreTeamA + 1;
        displayForTeamA(RunsScoreTeamA);
    }

    /**
     * This method displays and adds 1 to team A's Wicket score when +1 button is clicked
     */
    public void plusOneWicketForTeamA(View view) {
        wicketsTeamA = wicketsTeamA + 1;
        displayWicketForTeamA(wicketsTeamA);
    }

    /**
     * This method displays and adds 6 to team B's Run score when +6 button is clicked
     */
    public void plusSixRunsForTeamB(View view) {
        RunsScoreTeamB = RunsScoreTeamB + 6;
        displayForTeamB(RunsScoreTeamB);
    }

    /**
     * This method displays and adds 4 to team B's  Run score when +4 button is clicked
     */
    public void plusFourRunsForTeamB(View view) {
        RunsScoreTeamB = RunsScoreTeamB + 4;
        displayForTeamB(RunsScoreTeamB);
    }

    /**
     * This method displays and adds 2 to team B's Runs score when +2 button is clicked
     */
    public void plusTwoRunsForTeamB(View view) {
        RunsScoreTeamB = RunsScoreTeamB + 2;
        displayForTeamB(RunsScoreTeamB);
    }

    /**
     * This method displays and adds 1 to team B's Runs score when +1 button is clicked
     */
    public void plusOneRunsForTeamB(View view) {
        RunsScoreTeamB = RunsScoreTeamB + 1;
        displayForTeamB(RunsScoreTeamB);
    }

    /**
     * This method displays and adds 1 to team B's Wicket score when +1 button is clicked
     */
    public void plusOneWicketForTeamB(View view) {
        wicketsTeamB = wicketsTeamB + 1;
        displayWicketForTeamB(wicketsTeamB);
    }

    /**
     * This method resets the score for a new game
     */
    public void resetScore(View view) {
        RunsScoreTeamA = 0;
        RunsScoreTeamB = 0;
        wicketsTeamA = 0;
        wicketsTeamB = 0;
        displayForTeamA(RunsScoreTeamA);
        displayForTeamB(RunsScoreTeamB);
        displayWicketForTeamA(wicketsTeamA);
        displayWicketForTeamB(wicketsTeamB);
    }

}

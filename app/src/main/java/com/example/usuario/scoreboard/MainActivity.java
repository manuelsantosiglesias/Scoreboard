package com.example.usuario.scoreboard;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private ScoreModel scoreModel;
    @BindView(R.id.txtScoreA)
    TextView txtScoreA;
    @BindView(R.id.txtScoreB)
    TextView txtScoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        scoreModel = ViewModelProviders.of(this).get(ScoreModel.class);
        changeScoreA(scoreModel.scoreA);
        changeScoreB(scoreModel.scoreB);
    }

    public void addScoreA1(View v) {
        scoreModel.scoreA = scoreModel.scoreA + 1;
        changeScoreA(scoreModel.scoreA);
    }

    public void addScoreA2(View v) {
        scoreModel.scoreA = scoreModel.scoreA + 2;
        changeScoreA(scoreModel.scoreA);
    }

    public void addScoreB(View v) {
        scoreModel.scoreB = scoreModel.scoreB + 1;
        changeScoreB(scoreModel.scoreB);
    }

    public void addScoreB2(View v) {
        scoreModel.scoreB = scoreModel.scoreB + 2;
        changeScoreB(scoreModel.scoreB);
    }

    public void changeScoreA(int i) {
        txtScoreA.setText(i + " puntos");
    }

    public void changeScoreB(int i) {
        txtScoreB.setText(i + " puntos");
    }

}

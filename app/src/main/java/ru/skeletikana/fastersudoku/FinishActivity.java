package ru.skeletikana.fastersudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {

    TextView txtScore;
    Button btnRetry, btnExitToMenu;

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(FinishActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        Intent boardIntent = getIntent();

        String fScore = boardIntent.getStringExtra("fscore");

        txtScore = (TextView) findViewById(R.id.txtScore);
        txtScore.setText(fScore);

        btnRetry = (Button) findViewById(R.id.btnRetry);
        btnExitToMenu = (Button) findViewById(R.id.btnExitToMenu);

        btnRetry.setOnClickListener(v -> {
            //Intent intent = new Intent(FinishActivity.this, );
        });

        btnExitToMenu.setOnClickListener(v -> {
            Intent intent = new Intent(FinishActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
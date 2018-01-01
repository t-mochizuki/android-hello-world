package com.example.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioGoo;
    private RadioButton radioChoki;
    private RadioButton radioPaa;

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGoo = (RadioButton)findViewById(R.id.radioGoo);
        radioChoki = (RadioButton)findViewById(R.id.radioChoki);
        radioPaa = (RadioButton)findViewById(R.id.radioPaa);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
    }

    public void onDuel(View view) {
        String result = "残念でした";
        if (radioGoo.isChecked()) {
            result = "引き分けでした";
        } else if (radioPaa.isChecked()) {
            result = "おめでとう";
        }
        resultTextView.setText(result);
        Toast.makeText(this, "私はグー", Toast.LENGTH_SHORT).show();
    }
}

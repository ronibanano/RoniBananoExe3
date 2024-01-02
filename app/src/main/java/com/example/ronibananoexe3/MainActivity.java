package com.example.ronibananoexe3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bt;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.button);
    }

    public void exe(View view) {
        for(int i=0;i<=6;i++){
            count++;
            bt.setText("this is a click number: "+count);
        }
        bt.setText("Enough to click.go to new start!");
    }
}
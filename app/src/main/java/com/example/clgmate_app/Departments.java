package com.example.clgmate_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Departments extends AppCompatActivity {

    TextView txtMarquee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);

        txtMarquee = findViewById(R.id.marquee);
        txtMarquee.setSelected(true);


    }
}
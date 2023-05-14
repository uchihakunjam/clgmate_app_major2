package com.example.clgmate_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OnlineFeesPayment extends AppCompatActivity {

    TextView txtMarquee1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_fees_payment);

        txtMarquee1 = findViewById(R.id.marquee1);
        txtMarquee1.setSelected(true);

    }
}
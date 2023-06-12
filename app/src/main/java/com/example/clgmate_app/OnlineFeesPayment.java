package com.example.clgmate_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OnlineFeesPayment extends AppCompatActivity {

    TextView txtMarquee1;
    Button sbicollect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_fees_payment);

        txtMarquee1 = findViewById(R.id.marquee1);
        txtMarquee1.setSelected(true);

        sbicollect = findViewById(R.id.onlinefeepay);

sbicollect.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        gotoUrl("https://www.onlinesbi.sbi/sbicollect/");
    }
});
    }

    private void gotoUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}
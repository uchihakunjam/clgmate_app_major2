package com.example.clgmate_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SyllabusIt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_it);

        Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
        btn1 = findViewById(R.id.syllabusbtn1);
        btn2 = findViewById(R.id.syllabusbtn2);
        btn3 = findViewById(R.id.facultybtn3);
        btn4 = findViewById(R.id.facultybtn4);
        btn5 = findViewById(R.id.facultybtn5);
        btn6 = findViewById(R.id.facultybtn6);
        btn7 = findViewById(R.id.onlinefeepay);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inext;

                inext = new Intent(SyllabusIt.this, DownloadAndViewActivity.class);
                startActivity(inext);

            }
        });
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view){
//                Intent inext3;
//
//                inext3 = new Intent(SyllabusIt.this, SyllabusElectrical.class);
//                startActivity(inext3);
//            }
//
//        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inext;

                inext = new Intent(SyllabusIt.this, SyllabusElectrical.class);
                startActivity(inext);

            }
        });

    }
}
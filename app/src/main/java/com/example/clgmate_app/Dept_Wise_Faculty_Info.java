package com.example.clgmate_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dept_Wise_Faculty_Info extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dept_wise_faculty_info);

        Button button1,button2,button3,button4,button5,button6,button7;
        button1 = findViewById(R.id.facultybtn1);
        button2 = findViewById(R.id.facultybtn2);
        button3 = findViewById(R.id.facultybtn3);
        button4 = findViewById(R.id.facultybtn4);
        button5 = findViewById(R.id.facultybtn5);
        button6 = findViewById(R.id.facultybtn6);
        button7 = findViewById(R.id.facultybtn7);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inext;

                inext = new Intent(Dept_Wise_Faculty_Info.this, FacultyActivity.class);
                startActivity(inext);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inext;

                inext = new Intent(Dept_Wise_Faculty_Info.this, FacultyActivityElectrical.class);
                startActivity(inext);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inext;

                inext = new Intent(Dept_Wise_Faculty_Info.this, FacultyActivityCs.class);
                startActivity(inext);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inext;

                inext = new Intent(Dept_Wise_Faculty_Info.this, FacultyActivityMechnical.class);
                startActivity(inext);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inext;

                inext = new Intent(Dept_Wise_Faculty_Info.this, FacultyActivityET.class);
                startActivity(inext);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inext;

                inext = new Intent(Dept_Wise_Faculty_Info.this, FacultyActivityCivil.class);
                startActivity(inext);

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inext;

                inext = new Intent(Dept_Wise_Faculty_Info.this, FacultyActivityMining.class);
                startActivity(inext);

            }
        });

    }
}
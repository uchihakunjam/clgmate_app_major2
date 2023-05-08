package com.example.clgmate_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EbookNewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebook_new);

        Button ebookbtn1,ebookbtn2,ebookbtn3,ebookbtn4,ebookbtn5,ebookbtn6,ebookbtn7;

        ebookbtn1=findViewById(R.id.ebookbtn1);
        ebookbtn2=findViewById(R.id.ebookbtn2);
        ebookbtn3=findViewById(R.id.ebookbtn3);
        ebookbtn4=findViewById(R.id.ebookbtn4);
        ebookbtn5=findViewById(R.id.ebookbtn5);
        ebookbtn6=findViewById(R.id.ebookbtn6);
        ebookbtn7=findViewById(R.id.ebookbtn7);

        ebookbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent inext;

                inext = new Intent(EbookNewActivity.this, EbookActivity.class);
                startActivity(inext);

            }
        });
//        btn


    }
}
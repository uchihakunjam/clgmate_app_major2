package com.example.clgmate_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.rajat.pdfviewer.PdfViewerActivity;

import java.util.ArrayList;
import java.util.List;

public class SyllabusElectrical extends AppCompatActivity {

    TextView bookName1,bookName2;
    Button viewbtn,downloadbtn;
    TextView bookNameEle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_electrical);

//        viewbtn=findViewById(R.id.viewbtnElectrical);
//        bookNameEle =  findViewById(R.id.syllabusele);
//        bookNameEle.setText("SyllabusElectrical.pdf");
//        viewbtn = findViewById(R.id.viewbtnElectrical);
//        downloadbtn = findViewById(R.id.viewbtnDownload);
//        bookName1.setText("Cryptography_and_Network_Security.pdf");
//
//        viewbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(PdfViewerActivity.Companion.launchPdfFromPath(
//                        getApplicationContext(),
//                        "SyllabusElectrical.pdf",
//                        "SyllabusElectrical.pdf/name",
//                        "assets",
//                        false,
//                        true
//
//                ));
//            }
//        });
        viewbtn = findViewById(R.id.viewbtnElectrical);
        viewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(PdfViewerActivity.Companion.launchPdfFromPath(
                        getApplicationContext(),
                        "SyllabusElectrical.pdf",
                        "SyllabusElectrical/name",
                        "assets",
                        false,
                        true

                ));
            }
        });


    }
}

//        bookName2 = findViewById(R.id.tvAeFileName2);
//        bookName2.setText("ERP.pdf");
//        viewEbook2 = findViewById(R.id.btnAeView2);
//        viewEbook2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(PdfViewerActivity.Companion.launchPdfFromPath(
//                        getApplicationContext(),
//                        "ERP.pdf",
//                        "ERP/name",
//                        "assets",
//                        false,
//                        true
//
//                ));
//            }
//        });



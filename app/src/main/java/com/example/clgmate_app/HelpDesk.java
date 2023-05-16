package com.example.clgmate_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rajat.pdfviewer.PdfViewerActivity;

public class HelpDesk extends AppCompatActivity {

    Button btnhelpdesk;
    TextView helpdeskFileName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_desk);

        helpdeskFileName = findViewById(R.id.tvAacFileName1);
        helpdeskFileName.setText("Help Desk");
        btnhelpdesk = findViewById(R.id.helpdeskbtnview);
        btnhelpdesk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(PdfViewerActivity.Companion.launchPdfFromPath(
                        getApplicationContext(),
                        "helpdesk.pdf",
                        "Help Desk Information",
                        "assets",
                        false,
                        true

                ));
            }
        });
    }

    }

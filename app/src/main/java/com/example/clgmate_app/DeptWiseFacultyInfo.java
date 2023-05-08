package com.example.clgmate_app;

import static android.content.ContentValues.TAG;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.clgmate_app.Models.FacultyModel;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class DeptWiseFacultyInfo extends AppCompatActivity {

    RecyclerView rvFacultyInfo;
    Button bSet,bGet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dept_wise_faculty_infor);
        List<String> fList = new ArrayList<>();


        bSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FacultyModel fm = new FacultyModel("Juca");
                FirebaseFirestore.getInstance().collection("faculty").document().set(fm).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Log.d(TAG, "Ho gya");
                    }
                });
            }
        });
        bGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseFirestore.getInstance().collection("faculty").addSnapshotListener(new EventListener<QuerySnapshot>() {
                    @Override
                    public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
fList.clear();
for(DocumentSnapshot snapshot : value){
    fList.add(snapshot.getString("name"));
}
                        FacultyAdapter adapter = new FacultyAdapter();

                    }
                });
            }
        });


    }
}
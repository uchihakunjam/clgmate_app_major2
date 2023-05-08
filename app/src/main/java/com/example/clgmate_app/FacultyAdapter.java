package com.example.clgmate_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clgmate_app.Models.FacultyModel;

import java.util.List;

public class FacultyAdapter extends RecyclerView.Adapter<FacultyAdapter.FacultyDataHolder> {
    private List<FacultyModel> facultyData;
    @NonNull
    @Override
    public FacultyDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.faculty_design_view, parent, false);
        return new FacultyDataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FacultyAdapter.FacultyDataHolder holder, int position) {
         FacultyModel fm = facultyData.get(position);
        holder.fDepartment.setText(fm.getName());
    }

    @Override
    public int getItemCount() {
        return facultyData.size();
    }

    public class FacultyDataHolder extends RecyclerView.ViewHolder {
        public TextView fDepartment;
        public FacultyDataHolder(@NonNull View itemView) {
            super(itemView);
            fDepartment = itemView.findViewById(R.id.fdvDepartement);
        }
    }
}

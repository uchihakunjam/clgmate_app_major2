package com.example.clgmate_app;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.clgmate_app.Adapters.RecipeAdapter;
import com.example.clgmate_app.Classes.RecyclerItemClickListener;
import com.example.clgmate_app.Models.RecipeModel;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private ImageSlider imageSlider;

    RecyclerView recyclerView;



    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recyclarView);




        //Here in mainactivity we will get the data
        //to show the following image and text and here adapter will do get these
        //arraylist is used cause to show list of items
        ArrayList <RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.syllabus ,"Syllabus"));
        list.add(new RecipeModel(R.drawable.ebook ,"E-book"));
        list.add(new RecipeModel(R.drawable.academiccalender ,"Academic calender"));
        list.add(new RecipeModel(R.drawable.faculty ,"Faculties"));
        list.add(new RecipeModel(R.drawable.department3,"Departments"));
        list.add(new RecipeModel(R.drawable.payment,"College fee payment"));
        list.add(new RecipeModel(R.drawable.placement1,"Placement cell"));
        list.add(new RecipeModel(R.drawable.helpdesk,"Helpdesk"));

        RecipeAdapter adapter = new RecipeAdapter(list ,getContext());
        recyclerView.setAdapter(adapter);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(layoutManager);


//        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL , false);
//        recyclerView.setLayoutManager(layoutManager);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL , true);
//        recyclerView.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext() , 2 );
        recyclerView.setLayoutManager(gridLayoutManager);


//        drawerLayout = view.findViewById(R.id.fhAddWDrawerLayout);
//        navigationView = view.findViewById(R.id.fHNavigationView);
//        toolbar = view.findViewById(R.id.fhToolbar);
//
//        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
//        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(getActivity(),drawerLayout,toolbar,R.string.OpenSidebar,R.string.CloseSidebar);
//        drawerLayout.addDrawerListener(toggle);
//        toggle.getDrawerArrowDrawable().setColor(Color.WHITE);
//        toggle.syncState();

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener
                (getContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                    switch(position){
                        case 0:
                            Intent intent = new Intent(getContext() , SyllabusIt.class);
                            startActivity(intent);
                            break;

                        case 1:
                            startActivity(new Intent(getContext(),EbookNewActivity.class));
                            break;

                        case 2:
                            startActivity(new Intent(getContext(),Academic_Calender.class));
                            break;

                        case 3:
                            startActivity(new Intent(getContext(),Dept_Wise_Faculty_Info.class));
                            break;

                        case 4:
                            startActivity(new Intent(getContext(),Departments.class));
                            break;

                        case 5:
                            startActivity(new Intent(getContext(),OnlineFeesPayment.class));
                            break;

                        case 6:
                            startActivity(new Intent(getContext(),PlacementCell.class));
                            break;

                        case 7:
                            startActivity(new Intent(getContext(),HelpDesk.class));
                            break;

                    }

                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }
                }


                ));


//------------------------------------------------------------------------------------------------

        imageSlider = view.findViewById(R.id.imageSlider);



        // Creating a list of images

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        // we can add some urls of the needed image in the "image URL"

        slideModels.add(new SlideModel("https://th.bing.com/th/id/R.d3966863310e9d936dc52baa27662844?rik=yQpUsj3GJPXyrQ&riu=http%3a%2f%2fgecbsp.ac.in%2fwp-content%2fuploads%2f2019%2f12%2f1-1000x400-1-624x250.png&ehk=0jnWIPjdiy9myIRypBIj3PHpc1Hd9rxRT5e7SbrdHsY%3d&risl=&pid=ImgRaw&r=0", ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.image5, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);




    }
}
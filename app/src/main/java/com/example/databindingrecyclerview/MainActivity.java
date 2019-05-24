package com.example.databindingrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

//https://www.youtube.com/watch?v=EukoLrBLTjE

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter( new RecyclerViewAdapter(this,  getData()));

    }

    private ArrayList<SportViewModel> getData() {
        ArrayList<SportViewModel> data = new ArrayList<>();
        SportViewModel model = new SportViewModel();
        model.sportName = "football";
        model.imgSrcId.set(R.drawable.ic_star_outline);
        data.add(model);


        model = new SportViewModel();
        model.sportName = "volleyball";
        model.imgSrcId.set(R.drawable.ic_star_outline);
        data.add(model);


        model = new SportViewModel();
        model.sportName = "tennis";
        model.imgSrcId.set(R.drawable.ic_star_outline);
        data.add(model);

        model = new SportViewModel();
        model.sportName = "basketball";
        model.imgSrcId.set(R.drawable.ic_star_outline);
        data.add(model);

        model = new SportViewModel();
        model.sportName = "volleyball";
        model.imgSrcId.set(R.drawable.ic_star_outline);
        data.add(model);


        model = new SportViewModel();
        model.sportName = "tennis";
        model.imgSrcId.set(R.drawable.ic_star_outline);
        data.add(model);

        model = new SportViewModel();
        model.sportName = "basketball";
        model.imgSrcId.set(R.drawable.ic_star_outline);
        data.add(model);

        model = new SportViewModel();
        model.sportName = "tennis";
        model.imgSrcId.set(R.drawable.ic_star_outline);
        data.add(model);

        model = new SportViewModel();
        model.sportName = "basketball";
        model.imgSrcId.set(R.drawable.ic_star_outline);
        data.add(model);

        model = new SportViewModel();
        model.sportName = "volleyball";
        model.imgSrcId.set(R.drawable.ic_star_outline);
        data.add(model);


        model = new SportViewModel();
        model.sportName = "tennis";
        model.imgSrcId.set(R.drawable.ic_star_outline);
        data.add(model);

        model = new SportViewModel();
        model.sportName = "basketball";
        model.imgSrcId.set(R.drawable.ic_star_outline);
        data.add(model);

        return data;
    }
}

package com.example.ubay.achmadirjikubay_1202154184_modul3;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class mainmenu extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<air> mAirdata;
    private AirAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();

        mRecyclerView =(RecyclerView) findViewById(R.id.recyclerView);

        int gridColumn = getResources().getInteger(R.integer.grid_column_count);

        mRecyclerView.  setLayoutManager(new GridLayoutManager(this,gridColumn));

        mAirdata = new ArrayList<>();

        mAdapter = new AirAdapter (this,mAirdata);

        mRecyclerView.setAdapter(mAdapter);

        initializeData();


    }
    public void initializeData(){
        String[] daftarair = getResources().getStringArray(R.array.nama_src);
        String[] infoair = getResources().getStringArray(R.array.info_src);
        TypedArray airImageResource = getResources().obtainTypedArray(R.array.gambar_src);

        mAirdata.clear();

        for(int a=0; a<daftarair.length; a++){
            mAirdata.add(new air(daftarair[a],infoair[a],airImageResource.getResourceId(a,0)));
        }
        airImageResource.recycle();

        mAdapter.notifyDataSetChanged();
    }
}

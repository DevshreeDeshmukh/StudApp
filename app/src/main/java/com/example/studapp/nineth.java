package com.example.studapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class nineth extends AppCompatActivity {
    Intent i=null;
    Intent ch=null;

    GridView gridView;
    ArrayList<studGrid> grid;
    adapterStudgrid ag;
    @SuppressLint("StaticFieldLeak")
    private static nineth instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineth);
        gridView=findViewById(R.id.grid_list);
        gridList();

        try {
        ag=new adapterStudgrid(this,grid);


            gridView.setAdapter(ag);
            instance = this;
        }catch (NullPointerException e)
        {}
    }

    private void gridList() {
        grid= new ArrayList<>();
        grid.add(new studGrid("Mathematics",R.drawable.mathicon));
        grid.add(new studGrid("Science",R.drawable.scienceicon));
        grid.add(new studGrid("Social Science",R.drawable.ssticon));
        grid.add(new studGrid("English",R.drawable.engicon));
        grid.add(new studGrid("Hindi",R.drawable.hindicon));
        grid.add(new studGrid("Sample Paper",R.drawable.samplepaper));


    }
    public  static  nineth getInstance()
    {
        return instance;
    }
    public void intentMath()
    {
        Intent intent=new Intent(nineth.this,maths9th.class);
        startActivity(intent);
    }
    public void intentScience()
    {
        Intent intent=new Intent(nineth.this,sci9th.class);
        startActivity(intent);

    }

    public void intentSst()
    {
        Intent intent=new Intent(nineth.this,sst9th.class);
        startActivity(intent);

    }
    public void  intentEng()
    {
        Intent intent=new Intent(nineth.this,eng9th.class);
        startActivity(intent);
    }
    public void intentHin()
    {
        Intent intent=new Intent(nineth.this,hin9th.class);
        startActivity(intent);

    }
    public void intentpaper()
    {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/cbse-sample-papers-for-class-9/"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }
}
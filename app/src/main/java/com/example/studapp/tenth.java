package com.example.studapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class tenth extends AppCompatActivity {
    Intent i=null;
    Intent ch=null;

    GridView gridView;
    ArrayList<studGrid> grid1;
    adapterStudgrid1 ag1;

    private static tenth instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        gridView=findViewById(R.id.grid_list);
        gridList();

        try {
            ag1= new adapterStudgrid1(this,grid1);


            gridView.setAdapter(ag1);
            instance = this;
        }catch (NullPointerException e)
        {}
    }

    private void gridList() {
        grid1= new ArrayList<>();
        grid1.add(new studGrid("Mathematics",R.drawable.mathicon));
        grid1.add(new studGrid("Science",R.drawable.scienceicon));
        grid1.add(new studGrid("Social Science",R.drawable.ssticon));
        grid1.add(new studGrid("English",R.drawable.engicon));
        grid1.add(new studGrid("Hindi",R.drawable.hindicon));
        grid1.add(new studGrid("Sample Paper",R.drawable.samplepaper));

    }
    public  static  tenth getInstance()
    {
        return instance;
    }
    public void intentMath()
    {
        Intent intent=new Intent(tenth.this,maths10th.class);
        startActivity(intent);
    }
    public void intentSci()
    {
        Intent intent=new Intent(tenth.this,sci10th.class);
        startActivity(intent);
    }
    public void intentSst()
    {
        Intent intent=new Intent(tenth.this,sst10th.class);
        startActivity(intent);
    }
    public void intentEng()
    {
        Intent intent=new Intent(tenth.this,eng10th.class);
        startActivity(intent);
    }
    public void intentHindi()
    {
        Intent intent=new Intent(tenth.this,hin10.class);
        startActivity(intent);
    }
    public void intentpaper()
    {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/cbse/cbse-class-10-sample-papers/"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }

}
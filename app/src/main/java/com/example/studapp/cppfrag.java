package com.example.studapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class cppfrag extends Fragment {
    private Button cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9;
    Intent i,ch;

    public cppfrag()
    {
        //constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view =  inflater.inflate(R.layout.activity_cppfrag,container,false);

        cb1 = view.findViewById(R.id.cb1);
        cb2 = view.findViewById(R.id.cb2);
        cb3 = view.findViewById(R.id.cb3);
        cb4 = view.findViewById(R.id.cb4);
        cb5 = view.findViewById(R.id.cb5);
        cb6 = view.findViewById(R.id.cb6);
        cb7 = view.findViewById(R.id.cb7);
        cb8 = view.findViewById(R.id.cb8);
        cb9 = view.findViewById(R.id.cb9);
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.programiz.com/cpp-programming"));
                ch = Intent.createChooser(i, "launch YouTube");
                startActivity(ch);
            }
        });
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.tutorialspoint.com/cplusplus/index.htm"));
                ch = Intent.createChooser(i, "launch YouTube");
                startActivity(ch);
            }
        });
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.javatpoint.com/cpp-tutorial"));
                ch = Intent.createChooser(i, "launch YouTube");
                startActivity(ch);
            }
        });
        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.geeksforgeeks.org/c-plus-plus"));
                ch = Intent.createChooser(i, "launch YouTube");
                startActivity(ch);
            }
        });
        cb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.w3schools.com/cpp/default.asp"));
                ch = Intent.createChooser(i, "launch YouTube");
                startActivity(ch);
            }
        });
        cb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.cplusplus.com/doc/tutorial"));
                ch = Intent.createChooser(i, "launch YouTube");
                startActivity(ch);
            }
        });
        cb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9agpFUAlPFe_VNSlXW5uE0YL"));
                ch = Intent.createChooser(i, "launch YouTube");
                startActivity(ch);
            }
        });
        cb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://youtube.com/playlist?list=PLfqMhTWNBTe0b2nM6JHVCnAkhQRGiZMSJ"));
                ch = Intent.createChooser(i, "launch YouTube");
                startActivity(ch);
            }
        });
        cb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://youtube.com/playlist?list=PLfVsf4Bjg79Cu5MYkyJ-u4SyQmMhFeC1C"));
                ch = Intent.createChooser(i, "launch YouTube");
                startActivity(ch);
            }
        });
        return view;

    }
}
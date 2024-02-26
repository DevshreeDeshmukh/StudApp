package com.example.studapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

public class eng9th extends AppCompatActivity {
    Intent i;
    Intent ch;
    TabHost host;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng9th);
        host = findViewById(R.id.host);
        host.setup();
        TabHost.TabSpec s=host.newTabSpec("Syllabus");
        s.setContent(R.id.tab1);
        s.setIndicator("Syllabus");
        host.addTab(s);

        s=host.newTabSpec("Videos");
        s.setContent(R.id.tab2);
        s.setIndicator("Videos");
        host.addTab(s);

        s=host.newTabSpec("Book");
        s.setContent(R.id.tab3);
        s.setIndicator("Book");
        host.addTab(s);
    }

    public void vid1(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/c/EnglishClass9"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);

    }

    public void vid2(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLhf4hr_x5XySucXlzBgD633vId0ES_Wrz"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);

    }

    public void vid3(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLhf4hr_x5XySivA2ppP2jX5VH2XoTJa4j"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);
    }

    public void vid4(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLhf4hr_x5XyRjLrb0r-fmym2Q64GnYYbH"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);
    }

    public void Book(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/ncert-books-class-9-english/"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);
    }

    public void Book1(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/ncert-books-class-9-english/"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);

    }

    public void Book2(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/ncert-books-class-9-english/"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);

    }
}
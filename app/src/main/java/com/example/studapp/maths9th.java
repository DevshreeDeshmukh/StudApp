package com.example.studapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

public class maths9th extends AppCompatActivity {
Intent i=null;
Intent ch=null;
TabHost host;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths9th);
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
        i.setData(Uri.parse("https://youtube.com/c/UnacademyClass9and10"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }

    public void vid2(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/c/cbseclassvideos"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }

    public void vid3(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/c/MathematicsClassIX"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);
    }

    public void vid4(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/c/VedantuClass910"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);
    }

    public void Book(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/cbse/class-9-math-book/"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);

    }
}
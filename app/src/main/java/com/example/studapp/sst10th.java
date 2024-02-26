package com.example.studapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

public class sst10th extends AppCompatActivity {
    Intent i=null;
    Intent ch=null;
    TabHost host;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sst10th);

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
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLqnSbN61X78wMaQSR3hUqM7yHdGpeDl0N"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }

    public void vid2(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLqnSbN61X78xg4kFyEYnDqqdGbwEBqG-F"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }

    public void vid3(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLqnSbN61X78x0-NK6tliEcMyknDL-xRRC"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);
    }

    public void vid4(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLqnSbN61X78yQDUQwegRZvMtBac2Kjgrs"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);
    }

    public void Book1(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/ncert-book-class-10-social-science/"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);

    }

    public void Book2(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/ncert-book-class-10-social-science/"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);
    }

    public void Book3(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/ncert-books-class-10-social-science/"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);
    }

    public void Book4(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://byjus.com/ncert-books-class-10-social-science/"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);
    }

    public void vid5(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/c/UnacademyClass9and10"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }
}
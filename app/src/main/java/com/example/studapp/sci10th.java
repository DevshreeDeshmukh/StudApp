package com.example.studapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

public class sci10th extends AppCompatActivity {
    Intent i;
    Intent ch;
    TabHost host;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci10th);


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
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLqnSbN61X78ztUToQw4ydvFsfXBwRxeUI"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }
    public void vid2(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLKb9HOyS0VGTBX-hgwgR25Qwo75AD76lO"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);

    }
    public void vid3_1(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLKb9HOyS0VGSQ54LP-6UIJEp51hJR6YvF"));
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
        i.setData(Uri.parse("https://byjus.com/ncert-books-class-10-science/"));
        ch = Intent.createChooser(i, "launch Drive");
        startActivity(ch);

    }

    public void vid3_2(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLKb9HOyS0VGTRRFvG3N7Q-Gsk8jsizFG3"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);
    }

    public void vid3_3(View view) {
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtube.com/playlist?list=PLKb9HOyS0VGTBX-hgwgR25Qwo75AD76lO"));
        ch = Intent.createChooser(i, "launch YouTube");
        startActivity(ch);
    }
    }

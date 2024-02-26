package com.example.studapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adapterStudgrid1 extends BaseAdapter {
    Context context1;
    ArrayList<studGrid> grid1;

    adapterStudgrid1(Context context1, ArrayList<studGrid> grid1)
    {
        this.context1=context1;
        this.grid1=grid1;
    }

    @Override
    public int getCount() {
        return grid1.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context1).inflate(R.layout.custom_grid,parent,false);
        TextView title=convertView.findViewById(R.id.text_design);
        ImageView image=convertView.findViewById(R.id.image_design);

        title.setText(grid1.get(position).getTitle());
        image.setImageResource(grid1.get(position).getImage());
        convertView.setOnClickListener(v -> {
            switch(position)
            {
                case 0:
                    tenth.getInstance().intentMath();
                    break;
                case 1:
                    tenth.getInstance().intentSci();
                    break;
                case 2:
                    tenth.getInstance().intentSst();
                    break;
                case 3:
                    tenth.getInstance().intentEng();
                    break;
                case 4:
                    tenth.getInstance().intentHindi();
                    break;
                case 5:
                    tenth.getInstance().intentpaper();
                    break;


            }
        });
        return convertView;

    }
}

package com.example.studapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
public class adapterStudgrid extends BaseAdapter {
    Context context;
    ArrayList<studGrid>  grid;

    public adapterStudgrid(Context context, ArrayList<studGrid> grid)
    {
        this.context=context;
        this.grid=grid;
    }
    @Override
    public int getCount() {
        return grid.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.custom_grid,parent,false);
        TextView title=convertView.findViewById(R.id.text_design);
        ImageView image=convertView.findViewById(R.id.image_design);

        title.setText(grid.get(position).getTitle());
        image.setImageResource(grid.get(position).getImage());
        convertView.setOnClickListener(v -> {
            switch(position)
            {
                case 0:
                    nineth.getInstance().intentMath();
                    break;
                case 1:
                    nineth.getInstance().intentScience();
                    break;
                case 2:
                    nineth.getInstance().intentSst();
                    break;
                case 3:
                    nineth.getInstance().intentEng();
                    break;
                case 4:
                    nineth.getInstance().intentHin();
                    break;
                case 5:
                    nineth.getInstance().intentpaper();
                    break;
            }
        });
        return convertView;
    }
}

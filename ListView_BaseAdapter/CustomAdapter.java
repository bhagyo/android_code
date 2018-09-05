package com.example.bhagyo.listview_baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    int[] flags;
    String[] countryNames;
    Context context;
    private LayoutInflater inflater; //xml view k view e convert korte layout inflater lage
    CustomAdapter(Context context, String[] countryNames, int[] flags){
        this.context=context;
        this.countryNames=countryNames;
        this.flags=flags;
    }
    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if(view == null){
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.base_adapter,viewGroup,false);
        }
        ImageView imageView = view.findViewById(R.id.image_view);
        TextView textView   = view.findViewById(R.id.countrynameID);

        imageView.setImageResource(flags[position]);
        textView.setText(countryNames[position]);

        return view;
    }
}

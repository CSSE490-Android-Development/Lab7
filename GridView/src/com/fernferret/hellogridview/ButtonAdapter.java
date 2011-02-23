package com.fernferret.hellogridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

public class ButtonAdapter extends BaseAdapter {
    private Context mContext;

    public ButtonAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mNumButtons;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        Button button;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
        	
            button = new Button(mContext);
            //button.setLayoutParams(new GridView.LayoutParams(85, 85));
            button.setPadding(8, 8, 8, 8);
        } else {
            button = (Button) convertView;
        }

        button.setText(position + "");
        return button;
    }

    // references to our images
    private Integer mNumButtons = 16;
}
package com.sunny.practice.restaurantorderform;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

class MenuItemsAdapter extends BaseAdapter {

    Context context;
    List<String> menuItemNames;
    LayoutInflater inflater;

    public MenuItemsAdapter(Context context, List<String> menuItemNames) {
        this.context = context;
        this.menuItemNames = menuItemNames;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return menuItemNames.size();
    }

    @Override
    public Object getItem(int position) {
        return menuItemNames.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.lst_items, null);

        TextView txt_item_name = (TextView) convertView.findViewById(R.id.txt_item_name);
        txt_item_name.setText(menuItemNames.get(position));

        CheckBox check_item = (CheckBox) convertView.findViewById(R.id.check_item);


        return convertView;
    }
}

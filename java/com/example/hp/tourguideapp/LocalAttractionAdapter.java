package com.example.hp.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocalAttractionAdapter  extends ArrayAdapter<LocalAttraction> {

    public LocalAttractionAdapter(Activity context, ArrayList<LocalAttraction> localAttraction) {
        super(context, 0, localAttraction);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        LocalAttraction currentLocalAttraction = getItem(position);

        TextView localAttractionNameTextView = (TextView) listItemView.findViewById(R.id.tv_attraction_name);
        localAttractionNameTextView.setText(currentLocalAttraction.getLocalAttractionName());

        TextView localAttractionAddressTextView = (TextView) listItemView.findViewById(R.id.tv_attraction_address);
        localAttractionAddressTextView.setText(currentLocalAttraction.getLocalAttractionAddress());

        TextView localAttractionOpeningHoursTextView = (TextView) listItemView.findViewById(R.id.tv_attraction_opening_hours);
        localAttractionOpeningHoursTextView.setText(currentLocalAttraction.getLocalAttractionOpeningHours());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.iv_attraction_image);
        imageView.setImageDrawable(currentLocalAttraction.getImageDrawable());

        return listItemView;
    }

}

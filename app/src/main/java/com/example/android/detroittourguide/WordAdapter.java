package com.example.android.detroittourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by eastm on 11/10/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent,
                    false);
        }

        final Word currentWord = getItem(position);

        //Get image
        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getImageResourceId());
        //Get item name
        TextView itemNameTextView = listItemView.findViewById(R.id.item_name);
        itemNameTextView.setText(currentWord.getName());
        //Get item address
        TextView itemAddressTextView = listItemView.findViewById(R.id.item_location);
        itemAddressTextView.setText(currentWord.getAddress());
        //Get item description

        TextView itemDescriptionTextView = listItemView.findViewById(R.id.item_description);

        itemDescriptionTextView.setText(currentWord.getDescription());



        listItemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = currentWord.getUrl();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                getContext().startActivity(intent);
            }
        });

        return listItemView;
    }



}
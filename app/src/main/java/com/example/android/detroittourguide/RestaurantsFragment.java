package com.example.android.detroittourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container,
                false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Loui's Pizza", "23141 Dequindre Rd, Hazel Park,"
        + " MI, 48030", "Legendary Detroit-style pizza joint", R.drawable.louis,
                "https://www.louispizza.net"));
        words.add(new Word("Fishbone\'s",
                "400 Monroe Ave, Detroit, MI 48226",
                "Seafood & Steak, Cajun flair",
                R.drawable.fishbones,
                "http://www.fishbonesusa.com/locations-greektown.html"));
        words.add(new Word("Nautical Deli", "23839 Jefferson Ave, "
        +"St Clair Shores, MI 48080", "", R.drawable.nauticaldeli,
                "https://www.nauticaldeli.com"));
        words.add(new Word("Green Lantern Lounge","28960 John R Rd, Madison"
                + " Heights, MI 48071",
                "Award winning pizza. Try the cheese bread!",
                R.drawable.greenlantern,
                "https://greenlanternlounge.com"));

        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

      listView.setAdapter(adapter);


    return rootView;
    }

}

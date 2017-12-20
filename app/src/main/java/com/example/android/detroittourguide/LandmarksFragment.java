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
public class LandmarksFragment extends Fragment {


    public LandmarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container,
                false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Motown Records",
                "2648 W Grand Blvd, Detroit,"
                + " MI, 48208", "Legendary record label",
                R.drawable.motownmuseum, "https://www.motownmuseum.org/"));
        words.add(new Word("Spirit of Detroit Statue",
                "2 Woodward Ave, Detroit, MI 48226",
                "City monument that represents the city of Detroit",
                R.drawable.spiritmain,
                "https://detroithistorical.org/learn/encyclopedia-of-detroit/spirit-detroit"));
        words.add(new Word("Guardian Building",
                "500 Griswold St, Detroit, MI 48226",
                "Timeless depiction of creativity and accomplishment",
                R.drawable.guardianbuilding,
                "https://www.historicdetroit.org/building/guardian-building/"));
        words.add(new Word("Renaissance Center",
                "E Jefferson Ave & Beaubien St, Detroit, MI 48243",
                "GM headquarters, home to dining, shopping, and the Marriot hotel",
                R.drawable.rencen, "https://www.gmrencen.com/"));
        words.add(new Word("Greektown",
                "Monroe Ave & Beaubien St, Detroit, MI 48226",
                "Greek food and gambling! What's not to love???",
                R.drawable.greektown,
                "https://www.greektowndetroit.org"));



        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);




        return rootView;
    }   }



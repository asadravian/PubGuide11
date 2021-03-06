package com.techneo360.pubguide11.Throwables;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.techneo360.pubguide11.Book;
import com.techneo360.pubguide11.R;
import com.techneo360.pubguide11.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Throwables extends Fragment {

    List<Book> lstBook;
    private AdView mAdView;


    public Throwables() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_throwables, container, false);


        lstBook = new ArrayList<>();


        lstBook.add(new Book("Smoke Grenade", "Grenade", "-------------------------------------------------------------------------\n\nTemporarily removes attlefield Vision allowing for sneaky reposition" + "\n" + "\n" + "Or just a good ole plain escape.", R.drawable.smoke));
        lstBook.add(new Book("Frag Grenade", "Grenade", "-------------------------------------------------------------------------\n\nExplosive charge to fragment the outer shell of the grenade in a shaped or radial pattern." + "\n" + "\n" + "", R.drawable.grenade));
        lstBook.add(new Book("Molotov Cocktail", "Grenade", "-------------------------------------------------------------------------\n\nThis best use for Molotov is an AOE Denial, for example, using the fire from the Molotov on a stair case making it difficult for the enemy to cross the choke point from the burning AOE Damage." + "\n" + "\n" + "", R.drawable.firegranade));
        lstBook.add(new Book("Stun Grenade", "Grenade", "-------------------------------------------------------------------------\n\nWill cause strong disorientation to everyone within the blast radius (~5m) in the form of a loud ringing and a strong reduction in framerate." + "\n" + "\n" + "It should be noted that the Stun Grenade ignores cover (rocks, walls) and can affect the user, making it unsafe to use for clearing buildings.", R.drawable.standgun));
        lstBook.add(new Book("Apple", "Grenade", "-------------------------------------------------------------------------\n\n" + "\n" + "\n" + "It just for throw", R.drawable.apple));


        RecyclerView myrv = (RecyclerView) v.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getContext(), lstBook);
        myrv.setLayoutManager(new GridLayoutManager(getContext(), 3));
        myrv.setAdapter(myAdapter);


        return v;
    }


    @Override
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AdView mAdView = (AdView) getView().findViewById(R.id.adView);
        AdView nAdView = (AdView) getView().findViewById(R.id.adViewz);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }
}

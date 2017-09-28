package com.shift.android.beautifulbulldog;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RankingsFragment extends Fragment {
    private ListView ratingList;

    public RankingsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_rankings, container, false);

        ratingList= (ListView) view.findViewById(R.id.rating_list);
        MainActivity mainActivity = (MainActivity) this.getActivity();

        BulldogArrayAdapter adapter = new BulldogArrayAdapter(this.getActivity(), mainActivity.realm.where(Bulldog.class).findAll());
        ratingList.setAdapter(adapter);

        ratingList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {final Bulldog bulldog = (Bulldog) adapterView.getItemAtPosition(i);
                Intent intent = new Intent(view.getContext(),BulldogActivity.class);
                intent.putExtra("bulldog",bulldog.getId());
                startActivity(intent);
            }
        });
        return view;

    }

}










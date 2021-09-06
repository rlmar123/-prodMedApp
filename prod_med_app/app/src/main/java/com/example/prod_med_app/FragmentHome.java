package com.example.prod_med_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prod_med_app.Model.Medication;
import com.example.prod_med_app.UI.RecyclerMedicationAdapt;

import java.util.ArrayList;


public class FragmentHome extends Fragment
{



    public FragmentHome()
    {

    }




 @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.home_fragment, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.test_recycler);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<Medication> our_medication_list = new ArrayList<>();

        // will delete
        our_medication_list.add(new Medication("Tylenol", "Acetimono[pehn", "James", "Jones", 45, 45, 2 ));
        our_medication_list.add(new Medication("Tylenol", "Acetimono[pehn", "James", "Jones", 45, 45, 2 ));
        our_medication_list.add(new Medication("Tylenol", "Acetimono[pehn", "James", "Jones", 45, 45, 2 ));
        our_medication_list.add(new Medication("Tylenol", "Acetimono[pehn", "James", "Jones", 45, 45, 2 ));
        our_medication_list.add(new Medication("Tylenol", "Acetimono[pehn", "James", "Jones", 45, 45, 2 ));

        //setup recycler_adapter
        RecyclerMedicationAdapt recycler_adapter = new RecyclerMedicationAdapt(getActivity(), our_medication_list);
        recyclerView.setAdapter(recycler_adapter);


        //keeps data up to date
        recycler_adapter.notifyDataSetChanged();


        return view;
    }

} // end Fragment
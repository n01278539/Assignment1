package com.example.kanjavpatel_ceng319lab1_ex1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.kanjavpatel_ceng319lab1_ex1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    String[] F1 = new String[]{
      "AI_activity",
      "VR_activity"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        ListView listView = (ListView) view.findViewById(R.id.listview);

        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, F1);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(view.getContext(),AI_Activity.class);
                    startActivity(intent);
                    Toast toast = Toast.makeText(getContext() , "AI Activity", Toast.LENGTH_SHORT);
                    toast.show();
                }
                if(position == 1){
                    Intent intent = new Intent(view.getContext(),VR_Activity.class);
                    startActivity(intent);
                    Toast toast = Toast.makeText(getContext() , "VR Activity", Toast.LENGTH_SHORT);
                    toast.show();
                }


            }
        });
//
        return view;
//        return inflater.inflate(R.layout.fragment_first, container, false);
    }

}
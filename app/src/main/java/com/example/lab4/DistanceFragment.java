package com.example.lab4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import android.view.View.OnClickListener;

public class DistanceFragment extends Fragment implements OnClickListener {

    private Button btnDistance;
    private TextView txtDistanceMiles;

    public DistanceFragment() {
        // Required empty public constructor
    }

    @Override
    public void onClick(View v) {

        txtDistanceMiles.setText("This is a test.");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_distance, container, false);

        txtDistanceMiles = (TextView)view.findViewById(R.id.txtDistanceMiles);

        Button b = (Button)view.findViewById(R.id.btnDistance);
        b.setOnClickListener( this );

        return view;

    }

}

package com.example.lab4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnClickListener;

public class DistanceFragment extends Fragment implements OnClickListener {

    private Button btnDistance;
    private EditText txtDistanceMiles;
    private EditText txtDistanceKilometers;

    public DistanceFragment() {
        // Required empty public constructor
    }

    @Override
    public void onClick(View b) {

        String kmString = txtDistanceKilometers.getText().toString();
        String miString = txtDistanceMiles.getText().toString();

        if (miString.equals("")) {
            if (!kmString.equals("")) {
                double km = Double.parseDouble(kmString);

                // convert km to mi
                double result = km / 8;
                result = result * 5;

                txtDistanceMiles.setText( String.valueOf(result) );
            }
        }
        else {
            double mi = Double.parseDouble(miString);

            // convert mi to km
            double result = mi / 5;
            result = result * 8;

            txtDistanceKilometers.setText( String.valueOf(result) );
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_distance, container, false);

        txtDistanceKilometers = (EditText)view.findViewById(R.id.KilometerseditText);
        txtDistanceMiles = (EditText)view.findViewById(R.id.MileseditText);

        Button b = (Button)view.findViewById(R.id.btnDistance);
        b.setOnClickListener( this );

        return view;
    }

}

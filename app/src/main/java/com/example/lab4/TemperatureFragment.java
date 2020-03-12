package com.example.lab4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnClickListener;

public class TemperatureFragment extends Fragment implements OnClickListener {

    private Button btnTemperature;
    private EditText txtTempteratureFahrenheit;
    private EditText txtTempteratureCelsius;

    public TemperatureFragment() {
        // Required empty public constructor
    }

    @Override
    public void onClick(View v) {

        String fString = txtTempteratureFahrenheit.getText().toString();
        String cString = txtTempteratureCelsius.getText().toString();

        if (fString.equals("")) {
            if (!cString.equals("")) {
                double c = Double.parseDouble(cString);

                double result = c * 9;
                result = result / 5;
                result = result + 32;

                txtTempteratureFahrenheit.setText( String.valueOf(result) );
            }
        }
        else {
            double f = Double.parseDouble(fString);

            double result = f - 32;
            result = result * 5;
            result = result /9;

            txtTempteratureCelsius.setText( String.valueOf(result) );
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_temperature, container, false);

        txtTempteratureCelsius = (EditText)view.findViewById(R.id.CelsiuseditText);
        txtTempteratureFahrenheit = (EditText)view.findViewById(R.id.FahrenheiteditText);

        Button b = (Button)view.findViewById(R.id.btnTemperature);
        b.setOnClickListener( this );

        return view;
    }

}

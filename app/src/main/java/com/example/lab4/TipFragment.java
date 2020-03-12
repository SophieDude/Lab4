package com.example.lab4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnClickListener;

public class TipFragment extends Fragment implements OnClickListener {

    private Button btnTip;
    private EditText txtTip;
    private EditText txtTipBill;
    private EditText txtTipPeople;

    public TipFragment() {
        // Required empty public constructor
    }

    @Override
    public void onClick(View b) {

        String BString = txtTipBill.getText().toString();
        String TString = txtTip.getText().toString();
        String PString = txtTipPeople.getText().toString();

        if (!BString.equals("") && !TString.equals("") && !PString.equals("")) {
                    double Bill = Double.parseDouble(BString);
                    double Tip = Double.parseDouble(TString);
                    double People = Double.parseDouble(PString);
                    double TipHolder = 0;
                    if (Tip != 0) {
                        TipHolder = Tip / 100;
                    }

                    double BillIncrease = Bill * TipHolder;
                    double result = Bill + BillIncrease;
                    if (People != 0) {
                        result = result / People;
                    }


                    txtTipPeople.setText( String.valueOf(result) );
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tip, container, false);

        txtTipBill = (EditText)view.findViewById(R.id.BilleditText);
        txtTip = (EditText)view.findViewById(R.id.TipeditText);
        txtTipPeople = (EditText)view.findViewById(R.id.PeopleeditText);

        Button b = (Button)view.findViewById(R.id.btnTip);
        b.setOnClickListener( this );

        return view;
    }

}

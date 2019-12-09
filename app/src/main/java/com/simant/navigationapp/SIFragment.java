package com.simant.navigationapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SIFragment extends Fragment {

    View view;
    Button buttoncircle;
    EditText etPrinciple, etRate, etTime;
    TextView textViewResult;
    String finalResult;

    public SIFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_si, container, false);
        etPrinciple = view.findViewById(R.id.editPrinciple);
        etRate = view.findViewById(R.id.editRate);
        etTime = view.findViewById(R.id.editTime);

        buttoncircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float principle = Float.parseFloat(etPrinciple.getText().toString());
                float rate = Float.parseFloat(etRate.getText().toString());
                float time = Float.parseFloat(etTime.getText().toString());
                float result = (principle*rate*time)/100;
                finalResult = String.valueOf(result);
                textViewResult.setText("The area of a circle is " + finalResult);
            }
        });
        return view;
    }

}

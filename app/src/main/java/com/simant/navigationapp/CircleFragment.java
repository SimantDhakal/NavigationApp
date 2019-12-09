package com.simant.navigationapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class CircleFragment extends Fragment {

    View view;
    Button buttoncircle;
    EditText etFirst;
    TextView textViewResult;
    String finalResult;

    public CircleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_circle, container, false);

        buttoncircle = view.findViewById(R.id.btnCalRadius);
        etFirst = view.findViewById(R.id.editNumber);
        textViewResult = view.findViewById(R.id.result);

        buttoncircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float radius = Float.parseFloat(etFirst.getText().toString());
                float result = 22/7*(radius*radius);
                finalResult = String.valueOf(result);
                textViewResult.setText("The area of a circle is " + finalResult);
            }
        });
        return view;
    }

}

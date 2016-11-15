package com.app.hokien007.fragmentcommunicator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentB extends Fragment {

    EditText edtB;
    TextView txtB;
    Button btnB;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_b, container, false);
        txtB = (TextView)view.findViewById(R.id.txtB);
        edtB = (EditText)view.findViewById(R.id.edtB);
        btnB = (Button)view.findViewById(R.id.btnB);

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FragmentA  fragmentA = (FragmentA) getFragmentManager().findFragmentById(R.id.fragmentA);
//                fragmentA.ChangeText(edtB.getText().toString());
            }
        });

        return view;
    }

    public void ChangeText(String str){
        txtB.setText(str);
    }
}

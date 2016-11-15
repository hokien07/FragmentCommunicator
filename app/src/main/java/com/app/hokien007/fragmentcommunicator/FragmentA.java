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

public class FragmentA extends Fragment {
    TextView txtA;
    EditText edtA;
    Button btnA;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_a, container, false);
        btnA = (Button)view.findViewById(R.id.btnA);
        edtA = (EditText) view.findViewById(R.id.edtA);
        txtA = (TextView)view.findViewById(R.id.txtA);


        Bundle myBundle = getArguments();
        if(myBundle != null){
            txtA.setText(myBundle.getString("dulieu"));
        }

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                TextView txtMain = (TextView) getActivity().findViewById(R.id.txtMain);
//                txtMain.setText(edtA.getText().toString());
            }
        });

        return view;
    }

    public void ChangeText(String content){
        txtA.setText(content);
    }
}

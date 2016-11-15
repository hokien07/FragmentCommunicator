package com.app.hokien007.fragmentcommunicator;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtMain;
    Button btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMain = (TextView)findViewById(R.id.txtMain);
        btnMain = (Button)findViewById(R.id.btnMain);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentA fragmentA = new FragmentA();
                Bundle bundle = new Bundle();
                bundle.putString("dulieu", "Android Fragment");
                fragmentA.setArguments(bundle);

                fragmentTransaction.add(R.id.fragmentContent,fragmentA);
                fragmentTransaction.commit();

//                FragmentA fragmentA = (FragmentA) getFragmentManager().findFragmentById(R.id.fragmentA);
//                FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentB);
//
//                fragmentA.ChangeText(txtMain.getText().toString());
//                fragmentB.ChangeText(txtMain.getText().toString());
            }
        });

    }
}

package com.example.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Fragment1 fragment1=new Fragment1();
    Button button;
    FragmentManager fragmentManager=getSupportFragmentManager();
    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentTransaction.add(R.id.ContainerA,fragment1);
                fragmentTransaction.commit();
            }
        });





    }
}

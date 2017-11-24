package com.example.dm2.demotica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Demotica extends AppCompatActivity {

    private Switch switch1;
    private Switch switch2;
    private ToggleButton toogle1;
    private ToggleButton toogle2;
    private ImageView cam1;
    private ImageView cam2;
    private ImageView bom1;
    private ImageView bom2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demotica);

        switch1=(Switch) findViewById(R.id.btnswitch);
        switch2=(Switch) findViewById(R.id.btnswitch2);

        toogle1=(ToggleButton) findViewById(R.id.btntoogle);
        toogle2=(ToggleButton) findViewById(R.id.btntoogle2);

        cam1=(ImageView) findViewById(R.id.camara1);
        cam2=(ImageView) findViewById(R.id.camara2);
        bom1=(ImageView) findViewById(R.id.imgbombilla1);
        bom2=(ImageView) findViewById(R.id.bombilla2);

    }

    public void lucesYcamaras(View view){

        if (toogle1.getText().toString().equals("NO")){
                cam2.setVisibility(View.INVISIBLE);
        }else {
            if (toogle1.getText().toString().equals("SI")){
                cam2.setVisibility(View.VISIBLE);
            }
        }

        if (toogle2.getText().toString().equals("NO")){
            bom2.setVisibility(View.INVISIBLE);
        }else {
            if (toogle2.getText().toString().equals("SI")){
                bom2.setVisibility(View.VISIBLE);
            }
        }

        if (switch1.isChecked()){
            cam1.setVisibility(View.VISIBLE);
        }else {
            if(!switch1.isChecked()){
                cam1.setVisibility(View.INVISIBLE);
            }
        }

        if (switch2.isChecked()){
            bom1.setVisibility(View.VISIBLE);
        }else {
            if(!switch2.isChecked()){
                bom1.setVisibility(View.INVISIBLE);
            }
        }


    }

}

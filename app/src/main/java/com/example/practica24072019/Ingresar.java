package com.example.practica24072019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Ingresar extends AppCompatActivity {
    private Button salir,cargar;
    private CheckBox c1,c2,c3,c4,c5;
    private RadioButton b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);
        c1=(CheckBox)findViewById(R.id.cb1_i);
        c2=(CheckBox)findViewById(R.id.cb2_i);
        c3=(CheckBox)findViewById(R.id.cb3_i);
        c4=(CheckBox)findViewById(R.id.cb4_i);
        c5=(CheckBox)findViewById(R.id.cb5_i);
        b1=(RadioButton)findViewById(R.id.rbA_i);
        b2=(RadioButton)findViewById(R.id.rbB_i);
        cargar=(Button)findViewById(R.id.cargar_p);
        cargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1.isChecked()||b2.isChecked()){
                    if (c1.isChecked()||c2.isChecked()||c3.isChecked()||c4.isChecked()||c5.isChecked()){
                        Intent ingre = new Intent(view.getContext(),Profesores.class);
                        startActivityForResult(ingre,0);
                    }else{
                        Toast.makeText(getApplicationContext(),"SELECCIONAR UNA MATERIA",Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"SELECCIONAR UN PERIODO",Toast.LENGTH_SHORT).show();
                }

            }
        });


        salir = (Button)findViewById(R.id.salir_p);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }


}

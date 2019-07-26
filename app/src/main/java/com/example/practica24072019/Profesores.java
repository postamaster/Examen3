package com.example.practica24072019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class Profesores extends AppCompatActivity {
    private Button salir,cargar;
    private Switch s1,s2,s3,s4,s5;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesores);
        salir=(Button)findViewById(R.id.salir_p);
        cargar=(Button)findViewById(R.id.cargar_p);
        s1=(Switch)findViewById(R.id.sw1_p);
        s2=(Switch)findViewById(R.id.sw2_p);
        s3=(Switch)findViewById(R.id.sw3_p);
        s4=(Switch)findViewById(R.id.sw4_p);
        s5=(Switch)findViewById(R.id.sw5_p);

        cargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s1.isChecked()||s2.isChecked()||s3.isChecked()||s4.isChecked()||s5.isChecked()){
                    Toast.makeText(getApplicationContext(),"SIGUIENTE",Toast.LENGTH_SHORT).show();
                    Intent ingre = new Intent(view.getContext(),Final.class);
                    startActivityForResult(ingre,0);
                }else{
                    Toast.makeText(getApplicationContext(),"DEBE SELECCIONAR ALMENOS UNA PROFESOR",Toast.LENGTH_SHORT).show();

                }

            }
        });
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

package com.example.practica24072019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usuario, password;
    private Button reg,acceder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario=(EditText)findViewById(R.id.et1_m);
        password=(EditText)findViewById(R.id.et2_m);
        reg=(Button)findViewById(R.id.btnRegistro_i);
        acceder=(Button)findViewById(R.id.btnIngresar_i);

        acceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user= usuario.getText().toString();
                String pass= password.getText().toString();
                if(user.length()!=0 && pass.length()!=0){

                    Toast.makeText(getApplicationContext(),"ACCESO CONCEDIDO",Toast.LENGTH_SHORT).show();
                    Intent ingre = new Intent(view.getContext(),Ingresar.class);
                    startActivityForResult(ingre,0);

                }
                else{
                    Toast.makeText(getApplicationContext(),"INSERTAR USUARIO Y CONTRASEÑA NO PUEDE HABER UN CAMPO VACIO",Toast.LENGTH_SHORT).show();
                }
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regis = new Intent(view.getContext(),Registro.class);
                startActivityForResult(regis,0);
            }
        });


    }
}

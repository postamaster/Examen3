package com.example.practica24072019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    private EditText nom,ape,control,user;
    private CheckBox info,ges,civil;
    private Button reg,ing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nom=(EditText)findViewById(R.id.et1_r);
        ape=(EditText)findViewById(R.id.et2_r);
        control=(EditText)findViewById(R.id.et3_r);
        user=(EditText)findViewById(R.id.et4_r);
        info=(CheckBox)findViewById(R.id.cbInfo_r);
        ges=(CheckBox)findViewById(R.id.cbGes_r);
        civil=(CheckBox)findViewById(R.id.cbCiv_r);
        reg=(Button)findViewById(R.id.btnRegistrar_r);
        ing=(Button)findViewById(R.id.btnIngresar_r);


    }
    public void main(View view){
        if(nom.length()!=0 && ape.length()!=0 && control.length()!=0&&user.length()!=0){
            if (info.isChecked()||ges.isChecked()||civil.isChecked()){
                Toast.makeText(getApplicationContext(),"REGISTRADO",Toast.LENGTH_SHORT).show();
                Intent ingre = new Intent(view.getContext(),MainActivity.class);
                startActivityForResult(ingre,0);
            }else{
                Toast.makeText(getApplicationContext(),"DEBE SELECCIONAR ALMENOS UNA CARRERA",Toast.LENGTH_SHORT).show();

            }


        }else{
            Toast.makeText(getApplicationContext(),"DEBE LLENAR TODOS LOS CAMPOS",Toast.LENGTH_SHORT).show();

        }
    }
}

package com.example.juliocesar.diseologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText passw, userName;
    Button btn_ir_inicioSesion,crear_cuenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        passw = findViewById(R.id.et_contrasena);
        userName = findViewById(R.id.et_nombre);

        btn_ir_inicioSesion=findViewById(R.id.btn_ir_inicioSesion);
        crear_cuenta=findViewById(R.id.crear_cuenta);



        btn_ir_inicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUp.this,MainActivity.class));
                finish();
            }
        });

        crear_cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String passwd = passw.getText().toString();
                String user = userName.getText().toString();
                if(passwd.length() > 0 && user.length() > 0){

                    Bundle data = new Bundle();
                    data.putString("usernames",user);
                    data.putString("passwds",passwd);
                    Intent ir =new Intent(SignUp.this,MainActivity.class);
                    ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TOP | ir.FLAG_ACTIVITY_CLEAR_TASK);
                    ir.putExtras(data);
                    startActivity(ir);

                } else {
                    Toast.makeText(SignUp.this,"Debe ingresar usuario y contraseña",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

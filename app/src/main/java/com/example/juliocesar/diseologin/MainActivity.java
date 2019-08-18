package com.example.juliocesar.diseologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_ir_crearCuenta,iniciar_sesion;
    EditText passw, userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"hola create",Toast.LENGTH_LONG).show();
        btn_ir_crearCuenta=findViewById(R.id.btn_ir_crearCuenta);
        iniciar_sesion=findViewById(R.id.iniciar_sesion);
        passw = findViewById(R.id.edPasswd);
        userName = findViewById(R.id.edUser);




        btn_ir_crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SignUp.class));
                finish();
            }
        });

        iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"yy",Toast.LENGTH_LONG).show();
                String passwd = passw.getText().toString();
                String user = userName.getText().toString();
                if(passwd.length() > 0 && user.length() > 0){
                    Bundle data = new Bundle();
                    data.putString("username",user);
                    data.putString("passwd",passwd);
                    Intent ir =new Intent(MainActivity.this,Main2Activity.class);
                    ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TOP | ir.FLAG_ACTIVITY_CLEAR_TASK);
                    ir.putExtras(data);
                    startActivity(ir);

                } else {
                    Toast.makeText(MainActivity.this,"Debe ingresar usuario y contraseña",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"hola destroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Bienvenido",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        /*switch (view.getId()){
            case R.id.btn1:
                this.navegar();
                break;
            default: return;

        }*/
    }
}

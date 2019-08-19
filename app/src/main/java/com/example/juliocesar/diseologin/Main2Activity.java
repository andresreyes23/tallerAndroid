package com.example.juliocesar.diseologin;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button siguiente;
    EditText  userName1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        siguiente=findViewById(R.id.siguiente);
        Bundle delivery = getIntent().getExtras();
        String userName = delivery.getString("username");
        //Toast.makeText(this,"Hola "+userName,Toast.LENGTH_LONG).show();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Hola "+userName)
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        return;
                    }
                }).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent ir = new Intent(getApplicationContext(), MainActivity.class);
                ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TOP | ir.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(ir);
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();





        String textoPasado = userName;
        TextView out = (TextView)findViewById(R.id.yaya);
        out.setText(textoPasado);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this,Main4Activity.class));
                finish();
            }
        });

    }


}

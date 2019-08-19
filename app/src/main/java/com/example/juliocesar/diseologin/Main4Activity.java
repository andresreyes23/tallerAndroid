package com.example.juliocesar.diseologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
Button volver,buscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        volver=findViewById(R.id.volver);
        buscar=findViewById(R.id.buscar);
        Bundle delivery = getIntent().getExtras();
        String userName = delivery.getString("username");


        final String textoPasado = userName;
        TextView out = (TextView)findViewById(R.id.yaya);
        out.setText(textoPasado);


        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main4Activity.this,MainActivity.class));
                finish();
            }
        });
        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main4Activity.this,Main5Activity.class));
                Bundle data = new Bundle();
                data.putString("username", textoPasado);
                Intent ir = new Intent(Main4Activity.this, Main5Activity.class);
                ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TOP | ir.FLAG_ACTIVITY_CLEAR_TASK);
                ir.putExtras(data);
                startActivity(ir);
            }
        });

    }
}

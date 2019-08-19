package com.example.juliocesar.diseologin;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
Button listo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        listo=findViewById(R.id.listo);

        listo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main5Activity.this,MainActivity.class));
                finish();
            }
        });
        Bundle delivery = getIntent().getExtras();
        String userName = delivery.getString("username");


        final String textoPasado = userName;
        TextView out = (TextView)findViewById(R.id.yaya);
        out.setText(textoPasado);
    }
    public void showDatePicker(View v) {
        DialogFragment newFragment = new MyDatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "date picker");
    }

}

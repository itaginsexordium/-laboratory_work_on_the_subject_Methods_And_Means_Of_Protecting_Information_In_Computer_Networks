package com.kg.shifrovatel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

import com.rengwuxian.materialedittext.MaterialEditText;

public class MainActivity extends AppCompatActivity {
    MaterialEditText edtNormalText,edtCriptText;
    Switch switcher;
    String criptText;
    Cript cript=new Cript();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtCriptText=(MaterialEditText) findViewById(R.id.edtCriptText);
        edtNormalText=(MaterialEditText) findViewById(R.id.edtNormalText);
        switcher=(Switch)findViewById(R.id.switch1);

    }



    public void cript(View view) {
        if (switcher.isChecked()) {
            criptText = cript.criptText(edtNormalText.getText().toString());
            edtCriptText.setText(criptText);
            edtCriptText.setVisibility(View.VISIBLE);
        }else {
            criptText = cript.decriptText(edtNormalText.getText().toString());
            edtCriptText.setText(criptText);
            edtCriptText.setVisibility(View.VISIBLE);
        }


    }
}

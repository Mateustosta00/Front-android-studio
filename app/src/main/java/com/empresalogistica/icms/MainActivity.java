package com.empresalogistica.icms;

import static com.empresalogistica.icms.R.id.Total;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mEditTextValor;
    private EditText mEditTextEstado;
    private TextView mTextoTotal;
    private TextView porcentagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


}
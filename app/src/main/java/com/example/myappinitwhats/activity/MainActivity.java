package com.example.myappinitwhats.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myappinitwhats.R;
import com.example.myappinitwhats.activity.ConnectWhats;

public class MainActivity extends AppCompatActivity {


    String numero = "5551984601729/?text=";
    String msg = "hello bro!";

    Button buttonSend;
    ConnectWhats connectWhats;
    EditText editNumero, editMsg;

    @Override
    protected void onStart() {
        super.onStart();
        editNumero.setText("5551");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init Componentes da tela
        editNumero = findViewById(R.id.editTextPhoneNumber);
        editMsg = findViewById(R.id.editTextMsg);
        buttonSend = findViewById(R.id.buttonInitConvers);


        
        connectWhats = new ConnectWhats(this);
    }

    public void iniciarMsg(View view ){
        numero = editNumero.getText().toString();
        msg = editMsg.getText().toString();

        if( !numero.isEmpty() && !msg.isEmpty()  ){

            connectWhats.initMsg(numero, msg);
        }else{
            Toast.makeText(this," preencha ambas as informações acima!", Toast.LENGTH_LONG).show();
        }
    }
}
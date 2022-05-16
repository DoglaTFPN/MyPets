package br.com.etecia.mypets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CafeBadilico_activity extends AppCompatActivity {

    CardView idCardView;
    Button Botao1;
    Button Botao2;
    Button Botao3;
    Button Botao4;
    Button Reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe_badio_layout);

        idCardView = findViewById(R.id.idCardView);

        idCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Botao1 = findViewById(R.id.Botao1);

        Botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Botao2 = findViewById(R.id.Botao2);

        Botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Botao3 = findViewById(R.id.Botao3);

        Botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Botao4 = findViewById(R.id.Botao4);

        Botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Reserva = findViewById(R.id.Reserva);

        Reserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }}
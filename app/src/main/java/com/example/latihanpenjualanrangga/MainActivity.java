package com.example.latihanpenjualanrangga;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etnamabarang, etjumlahbarang, ethargasatuan, etbayar, etkembalian;
    Button btnhasil, btnhasil1;
    TextView tvtotalharga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnamabarang = (EditText) findViewById(R.id. etnamabarang);
        etjumlahbarang = (EditText) findViewById(R.id. etjumlahbarang);
        ethargasatuan = (EditText) findViewById(R.id. ethargasatuan);
        etbayar= (EditText) findViewById(R.id. etbayar);
        etkembalian = (EditText) findViewById(R.id. etkembalian);
        btnhasil = (Button) findViewById(R.id. bthasil);
        btnhasil1 = (Button) findViewById(R.id. btnhasil1);
        tvtotalharga = (TextView) findViewById(R.id. tvtotalharga);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double jumlahbarang, hargasatuan, hasil;
                jumlahbarang = Double.valueOf(etjumlahbarang.getText().toString().trim());
                hargasatuan = Double.valueOf(ethargasatuan.getText().toString().trim());

                hasil = jumlahbarang * hargasatuan;

                String hasill = String.valueOf(hasil);
                tvtotalharga.setText(hasill);

            }
        });

        btnhasil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bayar, totalharga1, hasil2;

                totalharga1 = Double.valueOf(tvtotalharga.getText().toString().trim());
                bayar = Double.valueOf(etbayar.getText().toString().trim());
                hasil2 = bayar - totalharga1;

                String hasil3 = String.valueOf(hasil2);
                etkembalian.setText(hasil3);

            }
        });

    }
}
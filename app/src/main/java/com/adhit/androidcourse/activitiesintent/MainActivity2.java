package com.adhit.androidcourse.activitiesintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView viewNamaLengkap = (TextView) findViewById(R.id.namaLengkap);
        TextView viewAlamat = (TextView) findViewById(R.id.alamat);
        TextView viewJenisKelamin = (TextView) findViewById(R.id.jenisKelamin);
        TextView viewUmur = (TextView) findViewById(R.id.umur);
        TextView viewUniversitas = (TextView) findViewById(R.id.universitas);
        TextView viewJurusan = (TextView) findViewById(R.id.jurusan);

        Bundle data = getIntent().getExtras();

        viewNamaLengkap.setText(data.getString("namaLengkap"));
        viewAlamat.setText(data.getString("alamat"));
        viewJenisKelamin.setText(data.getString("jenisKelamin"));
        viewUmur.setText(data.getString("umur"));
        viewUniversitas.setText(data.getString("universitas"));
        viewJurusan.setText(data.getString("jurusan"));

        Toast.makeText(this, "Data berhasil", Toast.LENGTH_SHORT).show();
    }
}
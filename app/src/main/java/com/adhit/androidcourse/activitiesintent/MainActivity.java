package com.adhit.androidcourse.activitiesintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText namaLengkap, alamat, jenisKelamin, umur, universitas, jurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = (Button) findViewById(R.id.submit);
        submitButton.setOnClickListener(this);

        namaLengkap = (EditText) findViewById(R.id.input_nama_lengkap);
        alamat = (EditText) findViewById(R.id.input_alamat);
        jenisKelamin = (EditText) findViewById(R.id.input_jenis_kelamin);
        umur = (EditText) findViewById(R.id.input_umur);
        universitas = (EditText) findViewById(R.id.input_universitas);
        jurusan = (EditText) findViewById(R.id.input_jurusan);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Registrasi Berhasil!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("namaLengkap", namaLengkap.getText().toString());
        intent.putExtra("alamat", alamat.getText().toString());
        intent.putExtra("jenisKelamin", jenisKelamin.getText(). toString());
        intent.putExtra("umur", umur.getText(). toString());
        intent.putExtra("universitas", universitas.getText(). toString());
        intent.putExtra("jurusan", jurusan.getText(). toString());
        startActivity(intent);
    }
}
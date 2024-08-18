package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;

public class RegristrarPantallaActivity extends AppCompatActivity {


    private FirebaseAuth mAuth;

    public RegristrarPantallaActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_regristrar_pantalla);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.Nombre);
        findViewById(R.id.Correo);
        findViewById(R.id.NumeroCelular);
        findViewById(R.id.Contrasena);

    }


    @Override
    public void onStart() {
        super.onStart();
        mAuth.getCurrentUser();
        //updateUI(currentUser);
    }

    public void Registrarse(View view) {
    }
}

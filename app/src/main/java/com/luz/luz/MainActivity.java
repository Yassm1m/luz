package com.luz.luz;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button lightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lightButton = findViewById(R.id.lightButton);

        lightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui a lógica para controlar as luzes ritmicas
                // Por exemplo, exibir uma mensagem de teste
                toggleLights();
            }
        });
    }

    private void toggleLights() {
        // Adicione aqui a lógica para controlar as luzes ritmicas
        // Por exemplo, exibir uma mensagem de teste
        Toast.makeText(this, "Luzes Rítmicas Toggled", Toast.LENGTH_SHORT).show();
    }
}

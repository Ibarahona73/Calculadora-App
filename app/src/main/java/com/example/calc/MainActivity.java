package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1EditText, num2EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1EditText = findViewById(R.id.editTextNum1);
        num2EditText = findViewById(R.id.editTextNum2);

        Button calcularButton = findViewById(R.id.buttonCalcular);
        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularOperaciones();
            }
        });
    }

    private void calcularOperaciones() {
        String num1Str = num1EditText.getText().toString();
        String num2Str = num2EditText.getText().toString();

        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);

            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("NUMERO1", num1);
            intent.putExtra("NUMERO2", num2);
            startActivity(intent);
        }
    }
}








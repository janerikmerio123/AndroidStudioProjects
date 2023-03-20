package com.example.laskinandroidi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numberOne;
    private EditText numberTwo;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOne = findViewById(R.id.editTextNumber);
        numberTwo = findViewById(R.id.editTextNumber2);
        textOutput = findViewById(R.id.answerNumberField);

    }

    public void sumNumbers(View view) {
        System.out.println(numberOne.getText().toString());
        System.out.println(numberTwo.getText().toString());

        int nro1 = Integer.parseInt(numberOne.getText().toString());
        int nro2 = Integer.parseInt(numberTwo.getText().toString());

        int result = nro1 + nro2;
        System.out.println(result);

        String answer = Integer.toString(result);
        textOutput.setText(answer);
    }
    public void minusNumbers(View view) {
        System.out.println(numberOne.getText().toString());
        System.out.println(numberTwo.getText().toString());

        int nro1 = Integer.parseInt(numberOne.getText().toString());
        int nro2 = Integer.parseInt(numberTwo.getText().toString());

        int result = nro1 - nro2;
        System.out.println(result);

        String answer = Integer.toString(result);
        textOutput.setText(answer);
    }

    public void multiplyNumbers(View view) {
        System.out.println(numberOne.getText().toString());
        System.out.println(numberTwo.getText().toString());

        int nro1 = Integer.parseInt(numberOne.getText().toString());
        int nro2 = Integer.parseInt(numberTwo.getText().toString());

        int result = nro1 * nro2;
        System.out.println(result);

        String answer = Integer.toString(result);
        textOutput.setText(answer);
    }

    public void subtractNumbers(View view) {
        System.out.println(numberOne.getText().toString());
        System.out.println(numberTwo.getText().toString());

        int nro1 = Integer.parseInt(numberOne.getText().toString());
        int nro2 = Integer.parseInt(numberTwo.getText().toString());

        int result = nro1 / nro2;
        System.out.println(result);

        String answer = Integer.toString(result);
        textOutput.setText(answer);
    }

}
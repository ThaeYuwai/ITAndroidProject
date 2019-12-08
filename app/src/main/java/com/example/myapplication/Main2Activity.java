package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void buAdd(View view) {
        try {
            EditText edtnum1 = findViewById(R.id.edtnum1);
            String n1 = edtnum1.getText().toString();
            int num1 = Integer.parseInt(n1);

            EditText edtnum2 = findViewById(R.id.edtnum2);
            String n2 = edtnum2.getText().toString();
            int num2 = Integer.parseInt(n2);

            int sum = num1 + num2;

            EditText edtResult = findViewById(R.id.edtResult);
            edtResult.setText(String.valueOf(sum));

            edtnum1.setText("");
            edtnum2.setText("");
            //Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
        }catch(Exception ex)
            {
            Toast.makeText(getApplicationContext(), "Input Error", Toast.LENGTH_LONG).show();
        }
    }

    public void buSubstract(View view) {

        try {
            EditText edtnum1 = findViewById(R.id.edtnum1);
            String n1 = edtnum1.getText().toString();
            int num1 = Integer.parseInt(n1);

            EditText edtnum2 = findViewById(R.id.edtnum2);
            String n2 = edtnum2.getText().toString();
            int num2 = Integer.parseInt(n2);

            int sub = num1 - num2;
            EditText edtResult = findViewById(R.id.edtResult);
            edtResult.setText(String.valueOf(sub));

            edtnum1.setText("");
            edtnum2.setText("");
        }catch(Exception e)
        {
            Toast.makeText(getApplicationContext(), "Input Error", Toast.LENGTH_LONG).show();
        }
    }
}

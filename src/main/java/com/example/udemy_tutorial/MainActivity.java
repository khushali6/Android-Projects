package com.example.udemy_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {


    public void click_Me(View view){
        EditText number=findViewById(R.id.editTextNumberDecimal);
        Log.i("Info","Button Pressed");
        Log.i("Edit",number.getText().toString());
        String dollar = number.getText().toString() ;
        double double_dollar=Double.parseDouble(dollar);
        double rupee= double_dollar * 73.38;
        Toast.makeText(this, "$ "+double_dollar+" = Rs "+rupee, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
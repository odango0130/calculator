package com.example.z3033902.kadai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(String string) {
        Toast t = makeText(this, string, LENGTH_SHORT);
        t.show();
    }

    public void onAdd(View view){
        //EditTextの取得 eT1:editText1
        EditText eT1 = (EditText)findViewById(R.id.eT1);
        EditText eT2 = (EditText)findViewById(R.id.eT2);

        //EditText → String
        String str1 = eT1.getText().toString();
        String str2 = eT2.getText().toString();

        //String → int
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        //足し算
        int sum = num1 + num2;

        //結果を表示
        ((TextView)findViewById(R.id.tvAns)).setText("" + sum);
        showToast("The answer is " + sum);

    }


}
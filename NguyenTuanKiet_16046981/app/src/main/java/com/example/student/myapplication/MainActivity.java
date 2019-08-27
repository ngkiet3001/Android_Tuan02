package com.example.student.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText numa,numb;
    TextView textview;
    Button tong,hieu,tich,thuong,usc,clear,thoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numa = (EditText) findViewById(R.id.numa);
        numb = (EditText) findViewById(R.id.numb);
        textview = (TextView) findViewById(R.id.textview);
        tong = (Button) findViewById(R.id.tong);
        hieu = (Button) findViewById(R.id.hieu);
        tich = (Button) findViewById(R.id.tich);
        thuong = (Button) findViewById(R.id.thuong);
        usc = (Button) findViewById(R.id.usc);
        clear=(Button)findViewById(R.id.clear);
        thoat = (Button) findViewById(R.id.thoat);

        Tong();
        Hieu();
        Tich();
        Thuong();
        Usc();
        Clear();
        //Thoat();

    }

    private void Tong(){
        tong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int a;
                int b;
                int tong;
                a =Integer.parseInt(numa.getText()+"");
                b =Integer.parseInt(numb.getText()+"");
                tong = a + b;
                textview.setText(textview.getText().toString() + tong);
            }
        });
    }
    private void Hieu(){
        hieu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int a;
                int b;
                int hieu;
                a =Integer.parseInt(numa.getText()+"");
                b =Integer.parseInt(numb.getText()+"");
                hieu = a - b;
                textview.setText(textview.getText().toString() + hieu);
            }
        });
    }
    private void Tich(){
        tich.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int a;
                int b;
                int tich;
                a =Integer.parseInt(numa.getText()+"");
                b =Integer.parseInt(numb.getText()+"");
                tich = a * b;
                textview.setText(textview.getText().toString() + tich);
            }
        });
    }
    private void Thuong(){
        thuong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int a;
                int b;
                int thuong;
                a =Integer.parseInt(numa.getText()+"");
                b =Integer.parseInt(numb.getText()+"");
                thuong = a / b;
                textview.setText(textview.getText().toString() + thuong);
            }
        });
    }
    private void Usc(){
        usc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a;
                int b;
                int usc;
                a =Integer.parseInt(numa.getText()+"");
                b =Integer.parseInt(numb.getText()+"");
                a=Math.abs(a);
                b=Math.abs(b);
                if (a==0 || b==0)
                    usc=a+b;

                while (a!=b)
                {
                    if(a>b)
                        a=a-b;
                    else b=b-a;
                }
                usc=a;
                textview.setText(textview.getText().toString() + usc);
            }
        });
    }
    private void Clear(){
        clear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                numa.setText("");
                numb.setText("");
                textview.setText("");
            }
        });
    }

}

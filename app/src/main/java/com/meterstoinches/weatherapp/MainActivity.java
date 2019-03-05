package com.meterstoinches.weatherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.btn1);
        b2=(Button) findViewById(R.id.btn2);
        b3=(Button) findViewById(R.id.btn3);
        b4=(Button) findViewById(R.id.btn4);
        b5=(Button) findViewById(R.id.btn5);
        b6=(Button) findViewById(R.id.btn6);
        b7=(Button) findViewById(R.id.btn7);
        b8=(Button) findViewById(R.id.btn8);
        b9=(Button) findViewById(R.id.btn9);
        b10=(Button) findViewById(R.id.btn10);
        b11=(Button) findViewById(R.id.btn11);
    }

    public void berlin(View view) {
        Intent s = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(s);
    }

    public void Bangalore(View view) {
        Intent s = new Intent(MainActivity.this,Main3Activity.class);
        startActivity(s);
    }

    public void London(View view) {
        Intent s = new Intent(MainActivity.this,Main4Activity.class);
        startActivity(s);
    }

    public void newyork(View view) {
        Intent s = new Intent(MainActivity.this,Main5Activity.class);
        startActivity(s);

    }

    public void Sydney(View view) {
        Intent s = new Intent(MainActivity.this,Main6Activity.class);
        startActivity(s);
    }

    public void montreal(View view) {
        Intent s = new Intent(MainActivity.this,Main7Activity.class);
        startActivity(s);
    }

    public void delhi(View view) {
        Intent s = new Intent(MainActivity.this,Main8Activity.class);
        startActivity(s);

    }

    public void los(View view) {
        Intent s = new Intent(MainActivity.this,Main9Activity.class);
        startActivity(s);

    }

    public void dubai(View view) {
        Intent s = new Intent(MainActivity.this,Main10Activity.class);
        startActivity(s);
    }

    public void perth(View view) {
        Intent s = new Intent(MainActivity.this,Main11Activity.class);
        startActivity(s);
    }

    public void toronto(View view) {
        Intent s = new Intent(MainActivity.this,Main12Activity.class);
        startActivity(s);
    }
}

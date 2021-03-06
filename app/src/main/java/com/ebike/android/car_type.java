package com.ebike.android;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class car_type extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_type);
        Toast.makeText(car_type.this,"请选择你的车型",Toast.LENGTH_SHORT).show();
        Button button_1 = (Button) findViewById(R.id.car_type_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(car_type.this, "车型设定成功",Toast.LENGTH_SHORT).show();
            }
        });
        Button button_2 = (Button) findViewById(R.id.car_type_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(car_type.this, "车型设定成功",Toast.LENGTH_SHORT).show();
            }
        });
        Button button_3 = (Button) findViewById(R.id.car_type_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(car_type.this, "车型设定成功",Toast.LENGTH_SHORT).show();
            }
        });
        Button button_4 = (Button) findViewById(R.id.car_type_4);
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(car_type.this, "车型设定成功",Toast.LENGTH_SHORT).show();
            }
        });
        Button button_5 = (Button) findViewById(R.id.car_type_5);
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(car_type.this, "车型设定成功",Toast.LENGTH_SHORT).show();
            }
        });
        Button button_6 = (Button) findViewById(R.id.car_type_6);
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(car_type.this, "车型设定成功",Toast.LENGTH_SHORT).show();
            }
        });
        Button button_7 = (Button) findViewById(R.id.car_type_7);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(car_type.this, "车型设定成功",Toast.LENGTH_SHORT).show();
            }
        });
        Button button_8 = (Button) findViewById(R.id.car_type_8);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(car_type.this, "车型设定成功",Toast.LENGTH_SHORT).show();
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_car_type);
        setSupportActionBar(toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout_car_type);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.mipmap.home);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            default:
        }
        return true;
    }
}

package com.example.tulika.knowme;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {
    FragmentManager fragmentManager;
    Button b1,b2,b3,b4,b5;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        fragmentManager=getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ach_Fragment d2= new Ach_Fragment();
                fragmentTransaction=fragmentManager.beginTransaction();


                fragmentTransaction.replace(R.id.myframe,d2);
                fragmentTransaction.commit();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dream_Fragment d5= new Dream_Fragment();
                fragmentTransaction=fragmentManager.beginTransaction();


                fragmentTransaction.replace(R.id.myframe,d5);
                fragmentTransaction.commit();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Exp_Fragment d4= new Exp_Fragment();
                fragmentTransaction=fragmentManager.beginTransaction();


                fragmentTransaction.replace(R.id.myframe,d4);
                fragmentTransaction.commit();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Love_Fragment d2= new Love_Fragment();
                fragmentTransaction=fragmentManager.beginTransaction();


                fragmentTransaction.replace(R.id.myframe,d2);
                fragmentTransaction.commit();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Skill_Fragment d1= new Skill_Fragment();
                fragmentTransaction=fragmentManager.beginTransaction();


                fragmentTransaction.replace(R.id.myframe,d1);
                fragmentTransaction.commit();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {

            case R.id.action_settings:
                AlertDialog.Builder builder= new AlertDialog.Builder(Welcome.this);
                builder.setTitle("Exit");
                builder.setMessage("Are you sure you wanna exit");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();


                    }
                });

                builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });
                builder.create();
                builder.show();
                break;
            case R.id.item2:
                Intent in =new Intent(Welcome.this,AboutApp.class);
                startActivity(in);
                finish();
                break;


        }

        return super.onOptionsItemSelected(item);
    }





}

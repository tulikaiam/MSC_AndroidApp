package com.example.tulika.knowme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutApp extends AppCompatActivity {
TextView t19;
    Button b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
        t19=(TextView)findViewById(R.id.textView19);
        b6=(Button)findViewById(R.id.button6);

        t19.setText("This app gives the user all the basic information regarding the developer ,and portrays the basic android concepts like nagivation," +
                "button implementation , use of fragments, options menu,splash screen,alert dialog box etc..");

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(AboutApp.this,Welcome.class);
                startActivity(in);
                finish();
            }
        });
    }
}

package com.radek.zabytki;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MySQLite mySQLite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // przyklad dodania zabytku do bazy
        mySQLite = new MySQLite(this);
//        mySQLite.dodaj(
//                new Monument("nazwa zabytku", "opis zabytku", 53.43143213, 27.4246841, "https://www.google.pl/")
//        );
//        Monument monument = mySQLite.pobierz(1);
//        momumentsInit();
//        Log.d("DB", monument.getUrl());

        final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intencja = new Intent(getApplicationContext(), Map.class);
                startActivity(intencja);
            }
        });

        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intencja = new Intent(getApplicationContext(), MonumentsList.class);
                startActivity(intencja);
            }
        });

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}

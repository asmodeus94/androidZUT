package com.radek.zabytki;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MonumentsList extends Activity {
    private SimpleCursorAdapter adapter;
    MySQLite db = new MySQLite(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments_list);


        this.adapter = new SimpleCursorAdapter(
                this,
                android.R.layout.simple_list_item_1,
                db.lista(),
                new String[]{"name", "_id"},
                new int[]{android.R.id.text1, android.R.id.text2},
                SimpleCursorAdapter.IGNORE_ITEM_VIEW_TYPE
        );

        ListView listview = (ListView) findViewById(R.id.listView);


        //////////////event////////////////////
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int pos, long id)
            {
                TextView name = (TextView) view.findViewById(android.R.id.text1);
                Monument ruin = db.pobierz(Integer.parseInt(name.getText().toString()));

                // Po podlaczeniu wyswietlania obiektu
                //Intent intencja = new Intent(getApplicationContext(), ~.class);
               // intencja.putExtra("element", ruin);
                //startActivityForResult(intencja, 2);
            }
        });
//
//        ////////////////////////////////////
        listview.setAdapter(this.adapter);
    }


}

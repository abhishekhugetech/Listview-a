package com.abhishek.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Selecting the ListView
        ListView myList = findViewById(R.id.listView);
        // Creating  a new ArrayList and using asList to Add Data to the List
        final ArrayList<String> myFriendArrayList = new ArrayList<String>(asList("Alaric","Ian","Paul","John","Elijah","Klaus","Michael","Elena","Bonny","Enzo","Rebeka"));
        // Creating an ArrayAdapter to Convert arrayList to a form in which we can add that arrayList to List View
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myFriendArrayList);
        // Setting Adapter for the List view to get the  List from
        myList.setAdapter(arrayAdapter);
        //Setting an onclick Listener to the List Item
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Hello " + myFriendArrayList.get(i) , Toast.LENGTH_SHORT).show();
            }
        });

    }
}

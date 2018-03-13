package com.a611solutions.emergencynumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SouthAmericaActivity extends AppCompatActivity {
    ListView list;
    //declaring a string array to store the numbers in the list with all the list items here
    String [] numbers = new String[]{ "Argentina  |  911", "Bolivia  |  911",
            "Brazil  |  192","Chile  |  131","Columbia  |  123","Ecuador  |  911","Falkland Islands  |  112 or 999",
            "French Guiana  |  112","Guyana  |  999","Paraguay  |  911","Peru  |  911","South Georgia and the South Sandwich Islands  |  999",
            "Suriname  |  112","Uruguay  |  911","Venezuela"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_america);

        //connecting list to  the xml layout
        list = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1,numbers);
        list.setAdapter(adapter);
    }
}

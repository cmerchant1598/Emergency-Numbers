package com.a611solutions.emergencynumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class OceaniaActivity extends AppCompatActivity {
    ListView list;
    //declaring a string array to store the numbers in the list with all the list items here
    String [] numbers = new String[]{ "American Samoa  |  911", "Australia  |  000","Cook Islands  |  998","Fiji  |  000 or 911",
            "French Polynesia  |  112","Guam  |  911","Kiribati  |  999","Marshall Islands  |  911","Micronesia  |  911","Nauru  |  111",
            "New Caledonia  |  112","New Zealand  |  111","Palau  |  911","Papua New Guinea  |  111","Samoa  |  999","Solomon Islands  |  911 or 999",
            "Tonga  |  911","Tuvalu  |  911","Vanuatu  |  112"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oceania);

        //connecting list to  the xml layout
        list = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1,numbers);
        list.setAdapter(adapter);
    }
}

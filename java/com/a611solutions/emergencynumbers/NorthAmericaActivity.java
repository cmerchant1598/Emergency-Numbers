package com.a611solutions.emergencynumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NorthAmericaActivity extends AppCompatActivity {
    ListView list;
    //declaring a string array to store the numbers in the list with all the list items here
    String [] numbers = new String[]{ "Antigua and Barbuda  |  911 or 999", "Anguilla  |  911",
            "Aruba  |  911","Belize  |  911 ","Bermuda  | 911","British Virgin Islands  |  911 or 999",
            "Canada  |  911","Clipperton Island  |  112","Cuba  |  104","Curacao  |  912","Dominica  |  999",
            "Grenada  |  911","Guadeloupe  |  112","Martinique  |  112","Mexico  |  066 or 911","Montserrat  |  011 or 999",
            "Navassa Island  |  911","Saint Kitts and Nevis  |  911","Saint Lucia  |  911 or 999","Saint Pierre and Miquelon  |  112",
            "Saint Vincent and the Grenadines  |  911 or 999","United States of America  |  911","United States Virgin Islands  |  911",
            "Barbados  |  911","The Bahamas  |  911 or 919","Bonaire  |  911","Cayman Islands  |  911","Costa Rica  |  911",
            "Dominican Republic  | 911","Guatemala  |  128","El Salvadore  |  132","Haiti  |  116","Hondoras  |  195","Jamaica  |  110",
            "Nicaragua  |  128","Panama  |  911","Puerto Rico  |  911","Trinidad and Tobago  |  990"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_america);

        //connecting list to  the xml layout
        list = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1,numbers);
        list.setAdapter(adapter);
    }
}

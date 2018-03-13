package com.a611solutions.emergencynumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EuropeActivity extends AppCompatActivity {
    ListView list;
    //declaring a string array to store the numbers in the list with all the list items here
    String [] numbers = new String[]{ "Aland Islands  |  112", "Albania  |  112","Andorra  |  112",
            "Armenia  |  112 or 911","Austria  |  112","Azerbaijan  |  112","Belarus  |  103","Belgium  |  112",
            "Boznia and Herzegovina  |  112","Bulgaria  |  112","Croatia  |  112","Cyprus  |  112 or 999"," Czech Republic  |  112",
            "Denmark  |  112","Estonia  |  112","Faroe Islands  |  112","Finland  |  112","France  |  112","Georgia  |  112",
            "Germany  |  112","Gibraltar  |  112 or 999","Greece  |  112","Greenland  |  112","Guernsey  |  112 or 999","Hungary  |  112",
            "Iceland  |  112","Ireland  |  112 or 999","Isle of Man  |  112 or 999","Jersey  |  112 or 999","Kosovo  |  112","Latvia  |  112",
            "Lithuania  |  112","Liechtenstein  |  112","Luxembourg  |  112","Republic of Macedonia  |  112","Malta  |  112","Moldova  |  903",
            "Monaco  |  112", "Montenegro  |  112","Nagorno-Karabakh  |  112","Netherlands  |  112","Northern Cyprus  |  112","Norway  |  113",
            "Poland  |  112","Portugal  |  112","Romania  |  112","Russia  |  112","San Marino  |  112","Serbia  |  194","Slovakia  | 112",
            "Slovenia  |  112","Spain  |  112","Sweden  |  112","Switzerland  |  112","Transnistria  |  103","Turkey  |  112","Ukraine  |  112",
            "United Kingdom  |  112 or 999","Vatican City  |  112"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europe);

        //connecting list to  the xml layout
        list = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1,numbers);
        list.setAdapter(adapter);
    }
}

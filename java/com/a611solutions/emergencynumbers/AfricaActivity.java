package com.a611solutions.emergencynumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AfricaActivity extends AppCompatActivity {
    ListView list;
    //declaring a string array to store the numbers in the list with all the list items here
    String [] numbers = new String[]{ "Algeria  |  14", "Angola  |  112", "Ascension Island  |  999",
            "Benin  |  112", "Burundi  |  112", "Botswana  |  911", "Burkina Faso  |  112", "Cameroon  |  112",
            "Cape Verde  |  130", "Central African Republic  |  1220", "Chad  |  2251-4242", "Comoros  |  772-03-73", "Republic of Congo  |  118",
            "Democratic Republic of Congo  |  118", "Djibouti  |  19", "Egypt  |  123", "Equitorial Guinea  |  112", "Eritrea  |  114", "Ethiopia  |  911",
            "Gabon  |  1300", "Gambia  |  116", "Ghana  |  999", "Guinea  |  442-020", "Guinea-Bissau  |  112", "Ivory Coast  |  185", "Liberia  |  911",
            "Kenya  |  112 or 999", "Libya  |  1515", "Lesotho  |  121", "Madagascar  |  124", "Malawi  |  998",
            "Mali  |  15", "Mauritius  |  114", "Mauritania  |  101", "Mayotte  |  112", "Morocco  |  15", "Mozambique  |  117", "Namibia  |  112",
            "Nigeria  |  112", "Niger  |  15", "Reunion  |  112", "Rwanda  |  912", "Saint Helena  |  911", "Sao Tome and Principe  |  112", "Senegal  |  15",
            "Seychelles  |  112 or 999", "Sierra Leone  |  999", "Somalia  |  999", "South Africa  |  10 177", "Sudan  |  999", "South Sudan  |  999",
            "Swanziland  |  977", "Tanzania  |  115", "Togo  |  8200", "Tristian da Cunha  |  911", "Tunisia  |  190", "Uganda  |  112", "Western Shara  |  150",
            "Zambia  |  999", "Zimbabwe  |  999"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africa);

        //connecting list to  the xml layout
        list = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1,numbers);
        list.setAdapter(adapter);


    }
}

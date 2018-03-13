package com.a611solutions.emergencynumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AsiaActivity extends AppCompatActivity {
    ListView list;
    //declaring a string array to store the numbers in the list with all the list items here
    String [] numbers = new String[]{ "Abkhazia  |  103", "Afghanistan  |  112", "Akrotiri and Dhekelia  |  112 or 999",
            "Bahrain  |  999","Bangladesh  |  199","Bhutan  |  112","British Indian Ocean Territory  |  112 or 999",
            "Brunei  |  991","Burma  |  999","Cambodia  |  119","People's Republic of China  |  120","Christmas Island  |  000",
            "Cocos Island  |  000","East Timor  |  112","Hong Kong  |  999","India  |  102","Indonesia  |  118","Iran  |  115",
            "Iraq  | 112 or 911","Israel  |  101","Japan  |  119","Jordan  |  911","Kazakhstan  |  112","Kyrgyzstan  |  103",
            "Democratic People's Republic of Korea  |  119","Republic of Korea  |  119","Kurdistan  |  112 or 911","Kwait  |  112",
            "Laos  |  195","Lebanon  |  140","Macau  |  999","Maldives  | 102","Malaysia  |  999","Mongolia  |  105","Nepal  | 102",
            "Oman  | 999","Pakistan  |  115","Philippines  |  911","Quatar  |  999","Saudi Arabia  |  112 or 911","Singapore  |  995",
            "SriLanka  |  110","Syria  |  110","Taiwan  |  119","Tajikistan  |  112","Thailand  |  1669","Turkmenistan  |  112",
            "United Arab Emerates  |  112","Uzbekistan  |  112","Vietnam  |  115","Yeman  |  191"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia);

        //connecting list to  the xml layout
        list = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1,numbers);
        list.setAdapter(adapter);
    }
}

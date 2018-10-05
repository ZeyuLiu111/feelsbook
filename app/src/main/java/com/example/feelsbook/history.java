package com.example.feelsbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class history extends AppCompatActivity {
    ListView listView;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

            ArrayList<String> list_string = new ArrayList<String>();
            try {
                FileInputStream fIn = openFileInput("history_emotion");
                if(fIn != null) {
                    InputStreamReader isr = new InputStreamReader(fIn);
                    BufferedReader reader = new BufferedReader(isr);
                    StringBuilder stringBuilder = new StringBuilder();
                    String str = "";
                    while( null != str){
                        list_string.add(str);
                        str = reader.readLine();
                    }
                    /*ret = stringBuilder.toString();*/
                }

            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            listView = findViewById(R.id.listview);
            ArrayAdapter adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item,list_string);
            listView.setAdapter(adapter);
            /*listView.setOnItemClickListener();*/
        }
        /*Bundle extras = getIntent().getExtras();
        String value = extras.getString("value");

        tv = (TextView)findViewById(R.id.textView2);
        tv.(value);


        listView = (listView)findViewById(R.id.listview);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,andriod.r.layout.)
    */
    }




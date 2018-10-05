package com.example.feelsbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class content extends AppCompatActivity {
    Button add_comment;
    EditText save_comment;
    String file_name = "history_emotion";
    String com = "";
    Date today = new Date();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd'T'hh:mm:ss");
    String date_str = format.format(today);



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_content);
        super.onCreate(savedInstanceState);
        save_comment = (EditText) findViewById(R.id.comment);
        com = save_comment.getText().toString();
        add_comment = (Button) findViewById(R.id.add_comment);
        add_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //savefile("rsnm");
                savefile(com);
                Intent toy = new Intent(content.this, MainActivity.class);
                startActivity(toy);
            }
        });
    }
                /*st = comment.getText().toString();
                i.putExtra("value",st);

                finish();*/
    public void savefile (String mood){
        String data = mood;
        Intent intent =getIntent();
        String emotion =intent.getExtras().getString("mood");

        try {
            FileOutputStream fout = openFileOutput(file_name, MODE_APPEND);
            OutputStreamWriter osw = new OutputStreamWriter(fout);
            osw.append(emotion + "\n|" + date_str + "|");
            osw.flush();
            osw.close();
            //Toast.makeText(this, "Saved", Toast.LENGTH_LONG);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
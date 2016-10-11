package com.example.student.ss101101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] data;
    ArrayList<Student> myList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new String[]{"AAA","BBB","CCC","DDD","EEE", "FFF", "GGG", "HHH", "QWRE","DFIH", "FIJG", "FFJU", "PIOL", "KYJ", "looyl", "glttt", "rihh,"};
        myList = new ArrayList<>();
        myList.add(new Student("Doris", "09856892"));
        myList.add(new Student("Mary", "08527321"));
        myList.add(new Student("John", "05029323"));

        lv = (ListView) findViewById(R.id.ListView);
        //MyAdapter adapter = new MyAdapter(MainActivity.this, data);
        MyAdapter adapter = new MyAdapter(MainActivity.this, myList);
        lv.setAdapter(adapter);
    }


}

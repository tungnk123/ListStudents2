package com.example.liststudents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private TextView textViewName;
    private TextView textViewId;
    private TextView textViewClassName;
    private TextView textViewDate;
    private ListView listViewSubject;
    private ImageView imageView;
    public int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Student student = (Student)intent.getSerializableExtra("Student");
        textViewName = (TextView) findViewById(R.id.textViewName2);
        textViewClassName = (TextView)findViewById(R.id.textViewClass2);
        textViewId = (TextView)findViewById(R.id.textViewId2);
        textViewDate = (TextView) findViewById(R.id.textViewDate2);
        listViewSubject = (ListView)findViewById(R.id.listViewSubject);
        imageView = (ImageView)findViewById(R.id.imageView2);

        textViewName.setText(student.name);
        textViewId.setText(student.id);
        textViewClassName.setText(student.classname);
        textViewDate.setText(student.date);
        if (student.id.equals("111")){
            imageView.setImageResource(R.drawable.student1);
            position = 0;
        }

        if (student.id.equals("222")){
            imageView.setImageResource(R.drawable.student2);
            position = 1;
        }

        if (student.id.equals("333")){
            imageView.setImageResource(R.drawable.student3);
            position = 2;
        }

        ArrayList<String> arrayList = new ArrayList<>();
        int count = student.subjects.size();
        for (Subject subject: student.subjects){
            arrayList.add(subject.idSubject + "    " + subject.name);
        }
//        arrayList.add(student.subjects[0].idSubject + "    " + student.subjects[0].name);
//        arrayList.add(student.subjects[1].idSubject + "    " + student.subjects[1].name);

        listViewSubject.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList));
    }
}
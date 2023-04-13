package com.example.liststudents;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        button = (Button)listView.findViewById(R.id.buttonReadMore);

        List<Student> studentsList = new ArrayList<>();
        ImageView imageView = new ImageView(this);
//        imageView.setImageResource(R.drawable.download);
        ArrayList<Subject> subjects1 = new ArrayList<>();
        subjects1.add(new Subject("SE001", "CNPM"));
        subjects1.add(new Subject("SE002", "KTTT"));

        ArrayList<Subject> subjects2 = new ArrayList<>();
        subjects2.add(new Subject("SE001", "CNPM"));
        subjects2.add(new Subject("SE002", "KTTT"));
        subjects2.add(new Subject("SE002", "KTTT"));
        subjects2.add(new Subject("SE002", "KTTT"));

        ArrayList<Subject> subjects3 = new ArrayList<>();
        subjects3.add(new Subject("SE001", "CNPM"));
        subjects3.add(new Subject("SE002", "KTTT"));
        subjects3.add(new Subject("SE002", "KTTT"));

        Student student1 = new Student("Nguyen Van A", "1/1/2003", "SE001", "111",imageView, subjects1);
        Student student2 = new Student("Nguyen Van B", "2/2/2001", "SE012", "222",imageView, subjects2);
        Student student3 = new Student("Nguyen Van C", "4/3/2006", "IT001", "333",imageView, subjects3);
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        StudentListAdapter studentListAdapter = new StudentListAdapter(this,R.layout.student_view,studentsList);

        listView.setAdapter(studentListAdapter);
    }
}
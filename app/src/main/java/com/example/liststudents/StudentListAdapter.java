package com.example.liststudents;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.Serializable;

import androidx.annotation.NonNull;

import java.util.List;

public class StudentListAdapter extends ArrayAdapter<Student> {
    int resource;
    private List<Student> studentsList;
    public StudentListAdapter(Context context, int resource, List<Student> studentLists){
        super(context, resource, studentLists);
        this.resource = resource;
        this.studentsList = studentLists;
    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        View v = convertView;
        if (v == null){
            LayoutInflater layoutInflater = LayoutInflater.from(this.getContext());
            v = layoutInflater.inflate(this.resource, null);
        }
        Student student = getItem(position);
        if (student != null){
            TextView textViewName = (TextView)v.findViewById(R.id.textViewName);
            TextView textViewDate = (TextView)v.findViewById(R.id.textViewDate);
            TextView textViewClass = (TextView)v.findViewById(R.id.textViewClass);
            TextView textViewId = (TextView)v.findViewById(R.id.textViewId);
            ImageView imageView = (ImageView) v.findViewById(R.id.imageView1);
            Button buttonReadMore = (Button) v.findViewById(R.id.buttonReadMore);
            buttonReadMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getContext(), SecondActivity.class);
                    intent.putExtra("Student", student);
                    getContext().startActivity(intent);
//                    Toast.makeText(getContext().getApplicationContext(), "Hello" + position, Toast.LENGTH_LONG).show();
                }
            });
            if (textViewName != null){
                textViewName.setText(student.name);
            }
            if (textViewDate != null){
                textViewDate.setText(student.date);
            }

            if (textViewName != null){
                textViewClass.setText(student.classname);
            }
            if (textViewId != null){
                textViewId.setText(student.id);
            }
            if (position == 0){
                imageView.setImageResource(R.drawable.student1);
            }
            if (position == 1){
                imageView.setImageResource(R.drawable.student2);
            }
            if (position == 2){
                imageView.setImageResource(R.drawable.student3);
            }
        }
        return v;
    }
}

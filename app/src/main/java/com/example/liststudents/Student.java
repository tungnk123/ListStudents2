package com.example.liststudents;

import android.media.Image;
import android.widget.ImageView;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    public String name;
    public String date;
    public String classname;
    transient public ImageView image;
    public String id;
    public ArrayList<Subject> subjects = new ArrayList<>();

    public Student (String n, String d, String c, String id, ImageView img, ArrayList<Subject> arr){
        name = n;
        date = d;
        classname = c;
        this.id = id;
        image = img;
        subjects = arr;

    }

}

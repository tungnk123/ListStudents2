package com.example.liststudents;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Subject implements Serializable {
    public String idSubject;
    public String name;

    public Subject(String id, String n){
        idSubject = id;
        name = n;
    }

    @NonNull
    @Override
    public String toString() {
        return idSubject + "    " + name;
    }
}

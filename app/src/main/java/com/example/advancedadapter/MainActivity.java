package com.example.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView studentListView;
    private ArrayList<Student> listOfStudents = new ArrayList<Student>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentListView = (ListView) findViewById(R.id.student);

        Student ethanStudent = new Student("Ethan", "Stacia", "CSCI");
        Student brianStudent = new Student("Brian", "Arleen", "CITA");
        Student kristinStudent = new Student("Kristin","Esther","CSCI");
        Student jeniferStudent = new Student("Jenifer", "Mabel","CITA");
        Student duncanStudent = new Student("Duncan", "Duke","CSCI");
        listOfStudents.add(ethanStudent);
        listOfStudents.add(brianStudent);
        listOfStudents.add(kristinStudent);
        listOfStudents.add(jeniferStudent);
        listOfStudents.add(duncanStudent);

        StudentAdapter studentAdapter = new StudentAdapter(getApplicationContext(),listOfStudents);
        studentListView.setAdapter(studentAdapter);


    }
}
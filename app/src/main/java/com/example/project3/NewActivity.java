package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {
    public Button button1;
    public Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
         button1 = (Button) findViewById(R.id.button);
         button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickButton2();
            }
        });
    }
    private void clickButton1(){
        Toast.makeText(this, "Расписания нет, отдыхаем!", Toast.LENGTH_SHORT).show();
    }
    private void clickButton2(){
        Toast.makeText(this, "Преподы тоже отдыхают!", Toast.LENGTH_SHORT).show();
    }
    private void showStudent(){
        Intent intent = new Intent(this, StudentActivity.class);
        startActivity(intent);
    }
    private void showTeacher(){
        Intent intent = new Intent(this, TeacherActivity.class);
        startActivity(intent);
    }
}
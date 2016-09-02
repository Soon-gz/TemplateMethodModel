package com.abings.templatemethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.abings.templatemethod.TemplateMethod.StuA;
import com.abings.templatemethod.TemplateMethod.StuB;
import com.abings.templatemethod.TemplateMethod.TestPaper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //A学生的卷子
        TestPaper testPaperA = new StuA();
        //B学生的卷子
        TestPaper testPaperB = new StuB();
        //A学生的答案
        testPaperA.Test1();
        testPaperA.Test2();
        //B学生的答案
        testPaperB.Test1();
        testPaperB.Test2();
    }
}

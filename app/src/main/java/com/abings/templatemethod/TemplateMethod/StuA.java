package com.abings.templatemethod.TemplateMethod;

/**
 * Created by HaomingXu on 2016/9/2.
 */
public class StuA extends TestPaper {
    @Override
    protected String answer2() {
        return "A";
    }

    @Override
    protected String answer1() {
        return "B";
    }
}

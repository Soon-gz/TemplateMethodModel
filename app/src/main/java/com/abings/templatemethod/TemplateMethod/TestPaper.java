package com.abings.templatemethod.TemplateMethod;

import android.util.Log;

/**
 * Created by HaomingXu on 2016/9/2.
 */
public abstract class TestPaper {
    /**
     *该方法是UML图中的Method()
     *@author Shuwen
     *created at 2016/9/2 16:42
     */
    public void Test1(){
        Log.i("TAG00","选择题1，毛浙东多大了？[] A.100岁  B.不知道 C.万岁");
        Log.i("TAG00","答案："+answer1());
    }

    public void Test2(){
        Log.i("TAG00","选择题2，妈妈多大了？[] A.34岁  B.不知道 C.万岁");
        Log.i("TAG00","答案："+answer2());
    }

    /**
     *算法中与特定的子类的关系
     *@author Shuwen
     *created at 2016/9/2 16:43
     */
    protected abstract String answer2();
    protected abstract String answer1();
}

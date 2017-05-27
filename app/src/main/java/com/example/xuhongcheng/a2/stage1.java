package com.example.xuhongcheng.a2;

/**
 * Created by xuhongcheng on 2017-05-27.
 */

public class stage1 {

    String s;

    public stage1(String s) {
        this.s = s;
    }

    public int Name(){
        if (s.equals("password"))
            return 0;
        else
            return 1;
    }

    public int Length(){
        if (s.length() >= 8)
            return 1;
        else
            return 0;
    }

    public int Special(){
        if (s.contains("s"))
            return 1;
        else
            return 0;
    }

    public int Digit(){
        if (s.matches(".*\\d+.*"))
            return 1;
        else
            return 0;
    }

    public int UpLo(){
        if (s.equals(s.toLowerCase()) || s.equals(s.toUpperCase()))
            return 0;
        else
            return 1;
    }


    public int pass() {
        return Name() + Length() + Special() + Digit() + UpLo();
    }



}

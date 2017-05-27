package com.example.xuhongcheng.a2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testName() {
        stage1 s1 = new stage1("1234567sS");
        stage1 s2 = new stage1("password");
        stage1 s3 = new stage1("passworD");
        stage1 s4 = new stage1("passworD1");
        stage1 s5 = new stage1("ssworD1");
        stage1 s6 = new stage1("password1");
        stage1 s7 = new stage1("pass1");
        stage1 s8 = new stage1("a");
        stage1 s9 = new stage1("1234567sS-'`.'.;;]");

        assertEquals(s1.pass(), 5);
        assertEquals(s2.pass(), 2);
        assertEquals(s3.pass(), 4);
        assertEquals(s4.pass(), 5);
        assertEquals(s5.pass(), 4);
        assertEquals(s6.pass(), 4);
        assertEquals(s7.pass(), 3);
        assertEquals(s8.pass(), 1);
        assertEquals(s9.pass(), 5);


    }
}
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
        stage1 s1 = new stage1("password");
        stage1 s2 = new stage1("password1");
        stage1 s3 = new stage1("p");
        stage1 s4 = new stage1("passwordpassword");
        stage1 s5 = new stage1("passwor");

        assertEquals(s1.pass(), 1);
        assertEquals(s2.pass(), 2);
        assertEquals(s3.pass(), 1);
        assertEquals(s4.pass(), 2);
        assertEquals(s5.pass(), 1);

    }
}
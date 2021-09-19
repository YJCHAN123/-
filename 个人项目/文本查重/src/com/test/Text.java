package com.test;

import com.main.Main;
import com.main.Repeatrate;
import org.junit.Test;

import java.io.IOException;


public class Text {
    @Test
    public void testMain(){
        try {
            Main.main(new String[]{"C:\\Users\\Administrator\\Desktop\\TEXT\\orig.txt","C:\\Users\\Administrator\\Desktop\\TEXT\\orig_0.8_add.txt","C:\\Users\\Administrator\\Desktop\\TEXT\\result.txt"});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRepeatrate() {
        try {
            Repeatrate.rate("C:\\Users\\Administrator\\Desktop\\TEXT\\orig.txt","C:\\Users\\Administrator\\Desktop\\TEXT\\orig_0.8_add.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

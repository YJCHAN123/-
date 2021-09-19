package com.main;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        float a = Repeatrate.rate(args[0],args[1]);
        String atext = args[2];
        System.out.println("输出结果文件：" + atext);
        System.out.println("重复率："+ a);
        String ans = "原文件绝对路径：" + args[0] + "\n" + "抄袭文件绝对路径：" + args[1] + "\n" + "输出结果文件绝对路径：" + args[2] + "\n" + "查重率：" + a;
        File f = new File(atext);
        try {
            FileWriter fw = new FileWriter(f);
            fw.write("");
            fw.flush();
            fw.write(ans);
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
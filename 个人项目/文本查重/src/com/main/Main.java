package com.main;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        float a = Repeatrate.rate(args[0],args[1]);
        String atext = args[2];
        System.out.println("�������ļ���" + atext);
        System.out.println("�ظ��ʣ�"+ a);
        String ans = "ԭ�ļ�����·����" + args[0] + "\n" + "��Ϯ�ļ�����·����" + args[1] + "\n" + "�������ļ�����·����" + args[2] + "\n" + "�����ʣ�" + a;
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
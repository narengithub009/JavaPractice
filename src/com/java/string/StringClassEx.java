package com.java.string;

public class StringClassEx {
    public static void main(String[] args) {
        String str="Hello world";
        System.out.println(str);

        String str1=new String("By using New keyword");
        System.out.println(str1);

        int x=9;
        String str2=String.valueOf(x);
        System.out.println("The value is "+str2);

        StringBuffer stringBuffer=new StringBuffer("Hello");
        stringBuffer.append("World");

        System.out.println(stringBufferv );
    }
}

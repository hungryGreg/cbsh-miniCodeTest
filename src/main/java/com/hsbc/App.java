package com.hsbc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int count = 100;
        NumberConvertor convertor = new NumberConvertor();
        for (int i = 1; i <= count; i++) {
            System.out.println(convertor.getZZByNum(i));
        }

        for (int i = 1; i <= count; i++) {
            System.out.println(convertor.getMoreZZByNum(i));
        }
    }
}

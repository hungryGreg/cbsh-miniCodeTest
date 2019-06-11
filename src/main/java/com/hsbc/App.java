package com.hsbc;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] a={2,3};
        List<String> result = DigitTranslator.convertToStr(a);
        System.out.println(result);

        int[] b={9};
        result = DigitTranslator.convertToStr(b);
        System.out.println(result);

        int[] c={23};
        result = DigitTranslator.convertToStr(c);
        System.out.println(result);

        int[] d={23,1,0,4};
        result = DigitTranslator.convertToStr(d);
        System.out.println(result);
    }
}

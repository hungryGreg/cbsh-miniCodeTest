package com.hsbc;

import org.junit.Assert;
import org.junit.Test;

public class DigitTranslatorTest {
    @Test
    public void testConvertToStr(){
        String result = "[ad, ae, af, bd, be, bf, cd, ce, cf]";
        int[] a = {2,3};
        Assert.assertEquals(result, DigitTranslator.convertToStr(a).toString());

        result="[w, x, y, z]";
        int[] b={9};
        Assert.assertEquals(result, DigitTranslator.convertToStr(b).toString());

        result="[ad, ae, af, bd, be, bf, cd, ce, cf]";
        int[] c={23};
        Assert.assertEquals(result, DigitTranslator.convertToStr(c).toString());

    }
}

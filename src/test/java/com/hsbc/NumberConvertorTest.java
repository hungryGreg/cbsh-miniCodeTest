package com.hsbc;

import org.junit.Assert;
import org.junit.Test;

public class NumberConvertorTest {
    NumberConvertor convertor = new NumberConvertor();

    @Test
    public void testGetZZByNum(){
        try{
            convertor.getZZByNum(-1);
        }
        catch (Exception ex){
            Assert.assertTrue(ex instanceof IllegalArgumentException);
        }
        Assert.assertEquals(convertor.getZZByNum(6), NumberConvertor.FIZZ);
        Assert.assertEquals(convertor.getZZByNum(25), NumberConvertor.BUZZ);
        Assert.assertEquals(convertor.getZZByNum(30), NumberConvertor.FIZZ_BUZZ);
    }

    @Test
    public void testGetMoreZZByNum(){
        try{
            convertor.getZZByNum(-1);
        }
        catch (Exception ex){
            Assert.assertTrue(ex instanceof IllegalArgumentException);
        }

        Assert.assertEquals(convertor.getMoreZZByNum(6), NumberConvertor.FIZZ);
        Assert.assertEquals(convertor.getMoreZZByNum(31), NumberConvertor.FIZZ);
        Assert.assertEquals(convertor.getMoreZZByNum(25), NumberConvertor.BUZZ);
        Assert.assertEquals(convertor.getMoreZZByNum(56), NumberConvertor.BUZZ);
        Assert.assertEquals(convertor.getMoreZZByNum(30), NumberConvertor.FIZZ_BUZZ);
        Assert.assertEquals(convertor.getMoreZZByNum(53), NumberConvertor.FIZZ_BUZZ);
    }
}

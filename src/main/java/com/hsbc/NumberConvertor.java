package com.hsbc;

public class NumberConvertor {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    private static final String ERROR_LESS_THAN_ZZERO = "number must be greater than 0.";
    public String getZZByNum(int num){
        if(num <= 0){
            throw new IllegalArgumentException(ERROR_LESS_THAN_ZZERO);
        }
        if(num%15 == 0) {
            return FIZZ_BUZZ;
        }
        if(num%3 == 0) {
            return FIZZ;
        }
        if(num%5 == 0) {
            return BUZZ;
        }
        return String.valueOf(num);
    }

    public String getMoreZZByNum(int num){
        if(num <= 0){
            throw new IllegalArgumentException(ERROR_LESS_THAN_ZZERO);
        }
        boolean hasThree = hasDigit(num, 3);
        boolean hasFive = hasDigit(num, 5);

        //todo Verify the requirement of stage2: A number is FizzBuzz if it is divisible by 3 or 5 or if has a 3 or 5 in it.
        /* *
            This is conflict with the first two requirements. So I implement it by change to:
                A number is FizzBuzz if it is divisible by 3 and 5 or if has a 3 and 5 in it.
        */
        if((hasFive && hasThree) || num % 15 == 0){
            return FIZZ_BUZZ;
        }

        if(hasThree || num % 3 == 0){
            return FIZZ;
        }
        if(hasFive || num % 5 == 0){
            return BUZZ;
        }
        return String.valueOf(num);
    }

    private static boolean hasDigit(int num, int digit){
        int tmp;
        while(num > 0){
            tmp = num % 10;
            if(tmp == digit){
                return true;
            }
            num /= 10;
        }
        return false;
    }
}

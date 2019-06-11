package com.hsbc;

import java.util.*;
import java.util.stream.Collectors;

public class DigitTranslator {
    private static Map<Integer, List<String>> map = new HashMap<>();

    static {
        map.put(2, Arrays.asList("a","b","c"));
        map.put(3, Arrays.asList("d","e","f"));
        map.put(4, Arrays.asList("g","h","i"));
        map.put(5, Arrays.asList("j","k","l"));
        map.put(6, Arrays.asList("m","n","o"));
        map.put(7, Arrays.asList("p","q","r","s"));
        map.put(8, Arrays.asList("t","u","v"));
        map.put(9, Arrays.asList("w","x","y","z"));
    }

    public static List<String> convertToStr(int src[]){
        if(src == null || src.length == 0){
            return new ArrayList<>();
        }

        List<Integer> filterList=new ArrayList<>();
        //split [45, 4] into [4, 5, 4]
        for (int i=0;i<src.length;i++){
            if(src[i]>10&& src[i]<100) {
                filterList.add(src[i] / 10);
                filterList.add(src[i]%10);
            }else{
                filterList.add(src[i]);
            }
        }

        //filter 0,1
        filterList = filterList.stream().filter(x -> x!=0 && x!=1).collect(Collectors.toList());
        Integer[] arr = filterList.toArray(new Integer[filterList.size()]);

        int arrLen = arr.length;
        int bit[] = new int[arrLen];
        int num = 1;
        for (int i = 0; i < arrLen; i++) {
            bit[i] = map.get(arr[i]).size();
            num *= bit[i];
        }

        List<String> letters = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int[] index = getIndex(bit, i);
            String str = getLetter(map, arr, index);
            letters.add(str);
        }
        return  letters;
    }

    public static String getLetter(Map<Integer, List<String>> map,Integer[] arr, int[] index){
        StringBuilder letter = new StringBuilder();
        for (int i = 0; i < index.length; i++) {
            letter.append(map.get(arr[i]).get(index[i]));
        }
        return letter.toString();
    }

    public static int[] getIndex(int[] bit, int n){
        int[] index = new int[bit.length];
        for (int i = bit.length -1; i >= 0 ; i--) {
            index[i] = n % bit[i];
            n /= bit[i];
        }
        return index;
    }

}

package com.codedifferently.problem03;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public Integer[] stringToNumbers(String[] input){
        HashMap<String,Integer>stringNumbers = new HashMap<>();
        ArrayList<Integer>inputAsIntegers = new ArrayList<>();
        stringNumbers.put("zero",0);
        stringNumbers.put("one",1);
        stringNumbers.put("two",2);
        stringNumbers.put("three",3);
        stringNumbers.put("four",4);
        stringNumbers.put("five",5);
        stringNumbers.put("six",6);
        stringNumbers.put("seven",7);
        stringNumbers.put("eight",8);
        stringNumbers.put("nine",9);
        stringNumbers.put("ten",10);
        stringNumbers.put("eleven",11);
        stringNumbers.put("twelve",12);
        stringNumbers.put("thirteen",13);
        stringNumbers.put("fourteen",14);
        stringNumbers.put("fifteen",15);
        stringNumbers.put("sixteen",16);
        stringNumbers.put("seventeen",17);
        stringNumbers.put("eighteen",18);
        stringNumbers.put("nineteen",19);
        stringNumbers.put("twenty",20);
        for(int i =0;i<input.length;i++){
            if(stringNumbers.containsKey(input[i])){
                inputAsIntegers.add(stringNumbers.get(input[i]));
            }
        }
        return inputAsIntegers.toArray(new Integer[inputAsIntegers.size()]);

    }
}

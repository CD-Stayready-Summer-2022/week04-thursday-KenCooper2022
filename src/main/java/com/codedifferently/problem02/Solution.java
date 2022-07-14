package com.codedifferently.problem02;

import java.util.HashMap;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        HashMap<Character,Integer>lettersAmount=new HashMap<Character,Integer>();
        for(int i=0;i<input.length();i++){
            if(!lettersAmount.containsKey(input.charAt(i))){
                lettersAmount.put(input.charAt(i),1);

            }else{
                lettersAmount.put(input.charAt(i),lettersAmount.get(input.charAt(i))+1);
            }


        }
        return lettersAmount.toString();

    }
}

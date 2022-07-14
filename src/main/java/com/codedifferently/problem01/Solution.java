package com.codedifferently.problem01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    /**
     * You will be given an array of numbers, search the array and return the longest
     * set of consecutive numbers
     * example input - {1,3,2,10,6,5,7,8}
     * return the String "Longest Set: {5 6 7 8}"
     * Even though 1,2,3 would the first consecutive set 5,6,7,8 is longer
     * @param allNumbers
     * @return
     */
    public String findLongestConsecutiveSet(Integer[] allNumbers){
        ArrayList<Integer> maxSequence = new ArrayList<>();
        ArrayList<Integer> currentSequence = new ArrayList<>();
        Arrays.sort(allNumbers);
        int curr=0;
        while(curr<allNumbers.length){
            int next=curr+1;
            currentSequence.add(allNumbers[curr]);
            if(next<allNumbers.length&&(allNumbers[next]-allNumbers[curr]==1)){
                curr++;
                continue;

            }else if(next<allNumbers.length&&(allNumbers[next]-allNumbers[curr]!=1&&currentSequence.size()>=maxSequence.size())){
                maxSequence.clear();
                maxSequence.addAll(currentSequence);
                currentSequence.clear();
                curr++;
                continue;
            }
            curr++;

        }

        if(currentSequence.size()> maxSequence.size()) return "Longest Set: "+currentSequence.toString().replaceAll("\\[", "{").replaceAll("\\]", "}").replaceAll(",","");
        return "Longest Set: "+ maxSequence.toString().replaceAll("\\[", "{").replaceAll("\\]", "}").replaceAll(",","");
    }



         /*
        Arrays.sort(allNumbers);
        ArrayList<Integer>curConsecutiveSequence = new ArrayList<>();
        HashMap<Integer,ArrayList>sequences =new HashMap<>();
        for(int i =0;i<allNumbers.length;){
            curConsecutiveSequence.add(allNumbers[i]);
            sequences.put(i,curConsecutiveSequence);
            if()
        }

        }

         */


}

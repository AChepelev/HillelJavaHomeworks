package hw2;

import java.util.*;
import java.lang.*;
import java.io.*;

//Example 2:
//Input: jewels = "z", stones = "ZZ"
//Output: 0

class Task2
{
    public static int numJewelsInStones(String jewels, String stones){
        int answer = 0;
        for (int i=0; i<stones.length();i++){
            for (int j=0;j<jewels.length();j++){
                if (stones.charAt(i) == jewels.charAt(j))
                    answer++;
            }
        }
        return answer;
    }

    public static void main (String[] args) throws java.lang.Exception{
        String jewels = "z";
        String stones = "ZZ";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
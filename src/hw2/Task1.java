package hw2;

import java.util.*;
import java.lang.*;
import java.io.*;

//Example 1:
//Input: jewels = "aA", stones = "aAAbbbb"
//Output: 3

class Task1 {
    public static int numJewelsInStones(String jewels, String stones) {
        int answer = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j))
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws java.lang.Exception {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
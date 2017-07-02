import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isValid(String s){
        HashMap<Character, Integer> countMap = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int count = 1;
            if(countMap.containsKey(ch)) {
                count = countMap.get(ch) + 1;
            }
            countMap.put(ch, count);
        }

        HashMap<Integer,Integer> typeMap = new HashMap<>();
        int min = Collections.min(countMap.values());
        int max = Collections.max(countMap.values());


        for(Character key: countMap.keySet()) {
            int count = countMap.get(key);
            int typeCount = 1;

            if(typeMap.containsKey(count))
                typeCount = typeMap.get(count) + 1;

            typeMap.put(count, typeCount);
        }

        if(typeMap.size() == 1  ||( typeMap.size() <= 2 && (typeMap.get(min) <= 1 || typeMap.get(max) <= 1)))
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}

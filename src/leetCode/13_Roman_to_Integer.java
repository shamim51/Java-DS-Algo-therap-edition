package leetCode;

import java.util.HashMap;
import java.util.Stack;

class RomanToINteger{
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        Character prev = 'I';

        for(int i = s.length()-1; i >= 0; i--){
            if(map.get(s.charAt(i)) < map.get(prev)){
                sum = sum - map.get(s.charAt(i));
            }
            else{
                sum = sum + map.get(s.charAt(i));
            }
            prev = s.charAt(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanToINteger r = new RomanToINteger();

        System.out.println(r.romanToInt("MCMXCIV"));

    }
}
package leetCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
class Paliondrome{
    public boolean isPalindrome(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp;
        if(x<0){
            temp = -(x);
        }
        else{
            temp = x;
        }

        while(temp != 0){
            list.add(temp%10);
            temp = temp/10;
        }

        int y = 0;

        int n = list.size();
        for (int i = 0; i < n; i++){
            y = (y*10) + list.get(i);
        }

        if (x == y) return true;

        return false;
    }

    public static void main(String[] args) {
        Paliondrome p = new Paliondrome();
        System.out.println(p.isPalindrome(10));
    }
}
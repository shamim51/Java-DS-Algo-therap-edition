package leetCode;

import java.util.Arrays;
import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int [] arr = new int[2];

        for(int i = 0; i < nums.length; i++){
            System.out.println("----------------->going inside loop "+ i+" <---------------------");
//            if(!map.containsKey(nums[i])){
//                map.put(nums[i], i);
//                System.out.println("I am in first if");
//                System.out.println(map);
//            }

            // {3 = 0}

            int diff = target - nums[i]; //diff = 6 - 3 = 3

            System.out.println("diff = "+diff);

            System.out.println(map);

            if(map.containsKey(diff)){
                System.out.println("I am in second if");

                arr[0] = map.get(diff);
                arr[1]  = i;
                System.out.println(arr[0]);
                System.out.println(arr[1]);

                //return arr;
                return new int[]{map.get(diff), i};
            }
            else {
                map.put(nums[i], i);
            }


        }
        //return arr;
        return arr;
    }
}

class Main
{
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int [] arr2 = {3, 2, 4};
        int [] arr3 = {2,7,11,15};


        TwoSum s = new TwoSum();

        System.out.println(Arrays.toString(s.twoSum(arr2, 6)));

    }
}

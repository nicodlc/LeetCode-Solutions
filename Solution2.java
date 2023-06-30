package LeetCodeProblems;

import java.util.Random;

public class Solution2 {
    public static void main(String[] args){
        Random rand = new Random();
        int[] myArray = new int[3+rand.nextInt(6)];
        for(int i = 0; i < myArray.length; i++){
            //making the input at least 1
            myArray[i] = 1 + rand.nextInt(4);
        }
        int[]second = new int[4];
        second[0] = 1;
        second[1] = 2;
        second[2] = 3;
        second[3] = 4;

        System.out.println(containsDuplicate(myArray));
    }
    public static boolean containsDuplicate(int[] nums) {
        boolean why = false;
        for(int a = 0; a < nums.length;a++){
            for(int b = a+1; b< nums.length;b++){
                if(nums[a] == nums[b]){
                    why = true;
                    break;
                }
            }
        }

        return why;
    }
}

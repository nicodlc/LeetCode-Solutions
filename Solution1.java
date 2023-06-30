package LeetCodeProblems;

import java.util.Random;
import java.util.Arrays;
//
public class Solution1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[3+ rand.nextInt(6)];
        int[] answer;
        int target = 5 + rand.nextInt(7);
        for(int i =0; i < array.length; i++){
            array[i] = rand.nextInt(10);
        }
        System.out.print("Given the array: " + Arrays.toString(array) + "\nTarget: " + target);
        answer = twoSum(array, target);
        System.out.println( "\n" + Arrays.toString(answer));
    }

    public static int[] twoSum(int[] nums, int target){
        int index1 = 0;
        int index2 = 0;
        for(int a = 0; a < nums.length; a++){
            for(int b = a+1; b < nums.length; b++){
                if(nums[a]+ nums[b] == target){
                    index1 = a;
                    index2 = b;
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = index1;
        answer[1] = index2;
        return answer;
    }
}

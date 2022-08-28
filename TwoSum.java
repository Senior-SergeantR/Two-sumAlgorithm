package leetcode;

import java.util.Arrays;

public class TwoSum {

        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }
            return new int[] {};
        }


    }
class Main{
    public static void main(String[] args) {
        TwoSum two = new TwoSum();
        int [] num = {2,7,11,15};
        int target = 9;
        int [] answer = two.twoSum(num,target);

        System.out.println(Arrays.toString(answer));



    }


}
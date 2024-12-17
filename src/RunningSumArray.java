// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]...nums[i]).
//Constraints:
//• The number of nodes in the list is in the range [1, 1000].
//• The value of each element in the array is in the range [-10^6, 10^6].
//
// If array is given ar = { 1,5,6,8,9}. What will be the running sum of it.
// ANS: ar = {1,6,12,20,29}

public class RunningSumArray {

    public int[] RunningSumOfArray(int[] num) {
        int[] result = new int[num.length];
        result[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            result[i] = num[i] + result[i - 1];
        }
        return result;
    }

    //Another approvh : Overwritten approch

    public int[] RunningSumOfArr(int[] num) {
        for (int i = 1; i < num.length; i++) {
            num[i] += num[i - 1];
        }
        return num;
    }


    public static void test(String[] args) {
        RunningSum run = new RunningSum();

        int[] nums = {1, 2, 3, 4};
        int[] result = run.RunningSumOfArray(nums);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
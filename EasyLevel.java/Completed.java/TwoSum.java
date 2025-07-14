import java.util.Scanner;
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter the array of nums: ");
        for(int i = 0; i < nums.length; i++){
             nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));    
        int[] res = twoSum(nums,target);
        System.out.print(Arrays.toString(res));
        sc.close();
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {}; // return empty array if no solution found
    }
}

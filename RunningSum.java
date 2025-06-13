import java.util.Scanner;
import java.util.Arrays;
public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
     //  System.out.println(Arrays.toString(nums));
       int[]  res = runningSum(nums);
       System.out.println(Arrays.toString(res));
       sc.close();
    }
    public static int[] runningSum(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0) {
                ans[i] = nums[i];
            } else {
                ans[i] = ans[i - 1] + nums[i];
            }
        }
        return ans;
    }
    }

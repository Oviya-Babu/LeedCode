import java.util.Scanner;
import java.util.Arrays;
public class ArrayPermutation{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[6];
        for(int i = 0; i < nums.length; i++){
             nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));    
        int[] res = buildArray(nums);
        System.out.print(Arrays.toString(res));
        sc.close();
    }
    public static int[] buildArray(int[] nums){
      int ans[] = new int[nums.length];
      for(int i = 0; i < nums.length; i++){
        ans[i] = nums[nums[i]];
        

      }
      return ans;
    }
}


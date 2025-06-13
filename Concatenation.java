import java.util.Scanner;
import java.util.Arrays;
public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
     //  System.out.println(Arrays.toString(nums));
       int[]  res = getConcatenation(nums);
       System.out.println(Arrays.toString(res));
       sc.close();

    }
    public static int[] getConcatenation(int[] nums){
        int ans[] = new int[nums.length + nums.length];
        for(int i = 0; i < nums.length; i ++){
           ans[i] = nums[i];

           ans[i + nums.length] = nums[i ];
        }   
        return ans; 

    }

}

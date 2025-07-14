import java.util.Scanner;
import java.util.Arrays;
public class ShuffleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the half Size of the Array: ");
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
      //  int[]  res = shuffle(int[] nums, int n);
      // System.out.println(Arrays.toString());
       sc.close();
    }
    //public int[] shuffle(int[] nums, int n) {
   //     int[] x = new int[n];
      //  return nums;


    //}
}
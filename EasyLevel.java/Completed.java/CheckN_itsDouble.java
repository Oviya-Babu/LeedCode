//import java.util.Scanner;
//import java.util.Arrays;
public class  CheckN_itsDouble{
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Size of the Array: ");
        // int size = sc.nextInt();
        // System.out.print("Enter the array: ");
        // int[] nums = new int[size];
        // for(int i = 0; i < nums.length; i++){
        //     nums[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(nums));

        int[] nums = {7, 1, 14, 11};
        boolean res = checkIfExist(nums);
        System.out.println(res);
      //  sc.close();

    } 
     public static boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length; j++){
                if((arr[i] == 2 * arr[j]) || (arr[j] == 2* arr[i])){
                    return true;
                }
            }
        }
        return false;
}
}
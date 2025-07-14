import java.util.Scanner;
import java.util.Arrays;
public class EvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array: ");
        int size = sc.nextInt();
        System.out.print("Enter the array: ");
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        int res = findNumbers(nums);
        System.out.println(res);
        sc.close();

    }
    // public static int findNumbers(int[] nums){
    //    int count = 0; 
    //    for(int  n : nums){
    //     while( n > 0){
    //         count = n % 10;
    //         count ++;
    //     }
    //    }
    //    return count;
    // }


     public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(evenDigits(num)){
                count++;
            }
        }
        return count;
        
    }
    public static boolean evenDigits(int num){
        int NumberofDigits = Digits(num);
            if( NumberofDigits %2 == 0){
                return true;
            }
        return false;
    }
    public static int Digits(int num){
        if(num < 0){
            num *= -1;
        }
        if(num == 0){
        return 1;
        }
        return (int)Math.log(num) +1;
    }
}


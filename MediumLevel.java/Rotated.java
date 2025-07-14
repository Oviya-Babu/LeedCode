import java.util.Arrays;

public class Rotated {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        rotate(arr);
        System.out.print(Arrays.toString(arr));
        
        
    }
    public static void rotate(int[] arr){
       int temp = arr[arr.length - 1];
       for(int i = 0; i < arr.length -1; i--){
        arr[i] = arr[i+1];

       }
       arr[0] = temp;
    }
}

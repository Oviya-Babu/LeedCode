public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-6,-4,-1,0,11,14,17,29,31,45,56};
        int target = 11;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
    public static int linearSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start )/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}


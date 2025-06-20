public class FirstLastOccurance{
    public static void main(String[] args) {

        
    }
    public static int[] searchRange(int[] nums, int target) {

        int ans[] = {-1,-1};
        ans[0] = isFindOccurance(nums, target, true);
        if(ans[0] != -1){
          ans[1] = isFindOccurance(nums, target, false);
        }
        return ans;  
        }
    public static int isFindOccurance(int[] nums, int target, boolean findFirstOccurance){
        // say potential answer
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                // Potential answer found
                ans = mid;
                if(findFirstOccurance){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
      
    }
}
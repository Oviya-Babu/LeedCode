public class Intersection {
    public static void main(String[] args) {
    int[] nums1 = {1,2,2,1};
    int[] nums2 = {2,2};
    int ans[] = intersection(nums1,nums2);
    System.out.println(ans);
    
}
 public static int[] intersection(int[] nums1, int[] nums2) {
    int ans[] = {};
    for(int i = 0; i < nums1.length; i++){
        for(int j = 0; j < nums2.length; j++){
            if(nums1[i] == nums2[j]){
              //  ans = nums[i][j];
                
            }

        }
    }
    return ans;
        
    }
    

}
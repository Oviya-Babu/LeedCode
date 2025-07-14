public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        boolean ans = isPalindrome(x);
        System.out.println(ans);

        
    }
    public static boolean isPalindrome(int x) {
        int temp = x;
        int ans = 0;
        while(temp > 0){
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp = temp / 10;
        }
        if (ans == x){
            return true;
        }
        else{
            return false;
        }
          }
}
    

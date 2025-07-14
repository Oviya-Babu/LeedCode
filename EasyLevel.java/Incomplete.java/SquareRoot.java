public class SquareRoot {
    public static void main(String[] args) {
         int x = 4;
         int result = mySqrt(x);
         System.out.println("Square root: " + result);
    }
     public static int mySqrt(int x) {
        while(x >0 ){
            double res = x * 0.5;
            return (int) res;
        }
        return -1;
        
    }

    
}


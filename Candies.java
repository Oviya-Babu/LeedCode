import java.util.*;
public class Candies {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Kids: ");
        int n = sc.nextInt();
        System.out.print("Enter the extra candies: ");
        int extraCandies = sc.nextInt();
        int[] candies = new int[n];
        System.out.println("Enter the Candies integer array: ");
        for(int i = 0; i < candies.length; i++){
             candies[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(candies));    
        List<Boolean> res = new Candies().kidsWithCandies(candies,extraCandies) ;
        System.out.print(res);
        sc.close();
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List <Boolean> result = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
            max = candies[i];
            } 
        }
         for (int candy : candies) {  
            if(candy + extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }

        }
        return result;
    }

    }


import java.util.Scanner;
public class SubSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int temp = n;
        int pro = 1;
        while(temp > 0){
            pro *= temp % 10;
            temp /= 10;
        }
        System.out.println("The product is :" + pro);
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n /= 10;

        }
        System.out.println("The sum is :" + sum);
        int result = pro - sum;
        System.out.println(result);
        sc.close();
        
    }

}

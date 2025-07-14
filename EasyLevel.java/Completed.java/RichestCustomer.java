import java.util.Scanner;
public class RichestCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Size of the Array: ");
        int Rowsize = sc.nextInt();
        System.out.println("Enter Coulumn Size of the Array: ");
        int Columnsize = sc.nextInt();
        int[][] accounts = new int[Rowsize][Columnsize];
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
            accounts[i][j] = sc.nextInt();
        }
        }
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                  System.out.print(accounts[i][j] + " ");
            }
            System.out.println();
        }
        int maximum = maxnumWealth(accounts);
        System.out.print(maximum);
       sc.close();
    }
    public static int maxnumWealth(int[][] accounts){
       int max = 0;
       for(int i = 0; i < accounts.length; i++){
        int sum = 0;
        for(int j = 0; j < accounts[i].length; j++){
            sum += accounts[i][j];
        }
        if( sum > max ){
            max = sum;
        }
     }
    return max;
    }
}

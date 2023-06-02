package Pattern;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number =");
        int n=x.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }x.close();
    }
    
}

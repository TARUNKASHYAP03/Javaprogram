import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enetre the number =");
        int n=x.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        x.close();

    }
    
}

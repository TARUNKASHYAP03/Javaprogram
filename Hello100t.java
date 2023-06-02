import java.util.Scanner;

public class Hello100t {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the your name =");
        String name=x.nextLine();
        System.out.println("Enter the number how many time print your name =");
        int n=x.nextInt();
        for(int i=0;i<=n;i++){
        System.out.print(name+ " ");
        }
        x.close();
        }
    }
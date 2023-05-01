import java.util.Scanner;

public class AreaC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of radius=");
        int r=sc.nextInt();
        float area=3.14f*r*r;
        System.out.println("Area of circle is "+area);
        sc.close();
    }
    
}

import java.util.Scanner;

public class Floatmul {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the two floating number=");
        float a=x.nextFloat();
        float b=x.nextFloat();
        float m=(float)a*b;
        System.out.println("The multiple of two float number is "+m);
        x.close();

    }
    
}

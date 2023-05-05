package Program;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the marks=");
        int a=x.nextInt();
        String p=(a>=33)? "PASS":"FAIL";
        System.out.println("Student is "+p);
        x.close();
    }
    
}

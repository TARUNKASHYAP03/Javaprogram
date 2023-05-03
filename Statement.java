package Program;

import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the your age =");
        int age=x.nextInt();
        if (age>=18){
            System.out.println("You are eligible to vote");
        }
        if (age> 16 && age <18){
            System.out.println("You are teenager");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
        x.close();
    }
}
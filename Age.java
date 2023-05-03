package Program;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the your age =");
        int age=x.nextInt();
        if (age>=18){
            System.out.println("Your are adult");
        }
        else if(age>=13 && age<18){
            System.out.println("Your are teenager");
        }
        else{
            System.out.println("Your are child");
        }
        x.close();
    }
    
}

package JavaProgram.Codechef;

import java.util.*;


class Waterconsumtion
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		// write your code here
    		if(x>=2000){
    		    System.out.println("Yes");
    		}else{
    		    System.out.println("No");
    		}
		}
        sc.close();
		
	}
}

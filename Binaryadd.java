import java.util.Scanner;

public class Binaryadd {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the first nmber");
        String a=x.nextLine();
        System.out.println("Enter the second number");
        String b=x.nextLine();
        int l1=a.length();
        int l2=b.length();
        if (l1>l2){
            b="0".repeat(l1-l2)+b;
        }
        else if (l2>l1){
            a="0".repeat(l2-l1)+a;
        }
        String result="";
        int carry=0;
        for(int i=a.length()-1;i>=0;i--){
            int d1=Integer.parseInt(a.charAt(i) + "");
            int d2=Integer.parseInt(b.charAt(i) + "");
            int sum=d1+d2+carry;
            if(sum==2){
                result="0"+result;
                carry=1;
            }
            else if (sum==3){
                result="1"+result;
                carry=1;
            }
            else{
                result=sum+result;
                carry=0;
            }
        }
        if(carry==1){
            result="1"+result;
        }
        System.out.println(result);
        x.close();
        }

    }
    

package odev;
import java.util.Scanner;
public class Desen {

    static void cikarma(int n, int temp){
        System.out.print(temp+" ");
        if(temp <= 0)
            add(n, temp+5);
        else
            cikarma(n,temp-5);
    }
    static void add(int n, int temp){
        System.out.print(temp+" ");
        if(n == temp)
            return ;
        else{
            add(n, temp+5);
        }
    }


    public static void main(String[]args){
        int n;
     Scanner input=new Scanner(System.in);
     System.out.println("N sayısı:");
     n=input.nextInt();
        cikarma(n, n);

    }
}

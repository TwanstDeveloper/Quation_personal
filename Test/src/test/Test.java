package test;
import java.util.Scanner;
public class Test {
    
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in); 
            System.out.print("Enter Name: ");
            String name=sc.next();
            System.out.print("Enter Age: ");
            int age=sc.nextInt();
            System.out.print("Write Country: ");
            String from=sc.next();
            System.out.println("--------------------Twanst Codes-------------------------");
            System.out.println("--------------------Like Comment-------------------------");
            System.out.println("Welcome Dear "+name);
            System.out.println("Your Age "+age+" Year's old");
            System.out.println("Your Country "+from);
    }
    
}

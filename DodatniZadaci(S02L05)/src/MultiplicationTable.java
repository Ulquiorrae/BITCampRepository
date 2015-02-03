import java.util.Scanner;
public class MultiplicationTable {
 
 public static void main(String [] args){
 
 System.out.println("Please enter a number from the keyboard: ");
 
 Scanner in = new Scanner(System.in);
 
 
 int number = in.nextInt();
 
 while(number <0 || number >10){
 System.out.println("Please enter a number between 0 and 10");
 number = in.nextInt();
 }
 
 createTable(number);
 }
 
 public static void createTable(int x){
 
 System.out.println("Your multiplication table is: ");
 
 for(int i =0; i<=10; i++){
 
 System.out.println(x + " x " + i + " = " + x*i);
 }
 }
}
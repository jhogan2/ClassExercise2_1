import java.util.Scanner;
public class Assignment2 {
	public static void main(String[]args){
		double a=0,b=0,c=0,d=0,e=0, sum=0, average=0, max=0, min=0, median=0, mode=0;
		System.out.print("Enter 5 numbers, place space between each: ");
		Scanner keyboard = new Scanner(System.in);
		a =keyboard.nextInt();
		b =keyboard.nextInt();
		c =keyboard.nextInt();
		d =keyboard.nextInt();
		e =keyboard.nextInt();
		sum =(a+b+c+d+e);
		average =((a+b+c+d+e)/5);
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + average);		
		}
}


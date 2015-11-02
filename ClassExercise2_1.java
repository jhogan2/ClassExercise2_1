import java.util.Scanner;

public class ClassExercise2_1 {
	public static void main(String [] args){
		Scanner keyboard; //variable for the inputs
		int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10; //variables for storing inputs
		int avg = 0;//variable for taking the avg
		keyboard = new Scanner(System.in);
		System.out.println("Enter ten numbers, with a comma in between each entry");
		keyboard.useDelimiter(",");
		//getting numbers from the user
		num1 = keyboard.nextInt();
		num2 = keyboard.nextInt();
		num3 = keyboard.nextInt();
		num4 = keyboard.nextInt();
		num5 = keyboard.nextInt();
		num6 = keyboard.nextInt();
		num7 = keyboard.nextInt();
		num8 = keyboard.nextInt();
		num9 = keyboard.nextInt();
		num10 = keyboard.nextInt();
		System.out.println("\t" + "Inputs received");
		avg = ((num1+num2+num3+num4+num5+num6+num7+num8+num9+num10)/10);
		System.out.println("The average is" + "\n" + "\"" + avg + "\"");
		keyboard.close();
		}
}



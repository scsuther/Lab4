import java.util.Scanner;

public class integerOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
	System.out.println("Hi there! What's your name?");
		String name = scnr.nextLine();
	
	System.out.println(name + ", please choose a number between 1 and 100.");
		int number = scnr.nextInt();
	
	
		
	
	
	if (number % 2 != 0 && number<60)
	{System.out.println(number + " Odd.");}
	else if (number % 2 == 0 && number < 25)
	{System.out.println("Even and less than 25.");}
	else if (number % 2 == 0 && number >= 26 && number <=60)
	{System.out.println("Even.");}
	else if (number % 2 == 0 && number > 60 && number <100)
	{System.out.println(number + " Even.");}
	else if ( number <100 && number % 2 != 0 &&  number>=60)
	{System.out.println(number + " Odd and over 60");}
	else if(number< 1 || number > 100)
		
	{System.out.println("Does not compute!");}
	}

}

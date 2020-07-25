import java.util.Scanner;
import java.util.Formatter;

public class tableOfPowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		Formatter fmt = new Formatter();

		System.out.println("Learn your squares and cubes!");

		String yes = "";
		
		do {
			System.out.println("Enter an integer");
			int n = scnr.nextInt();
			System.out.println("  Num  Sq.  Cu.");
			
			for (int i = 1; i <= n; i++) {
				fmt = new Formatter();
											
				fmt.format("%4d %4d %4d", i, i * i, i * i * i);
				System.out.println(fmt);
			}
			System.out.println("Do you want to continue? y/n");
			yes = scnr.nextLine();

		} while (scnr.nextLine().equalsIgnoreCase("y"));

	}

}

import java.util.Scanner;

public class Figures {
	
	private static int size = 0;
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		//Prints my info
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Zachary Bennitt");
		System.out.println("PROGRAMMING ASSIGNMENT 2");
		System.out.println(" ");
		
		//Create scanner for user
		scan = new Scanner(System.in);
		System.out.print("Enter the size of the figure (odd number): ");
		int usersize = scan.nextInt();
		
		//Check to see that user input an odd number - if even, this loop will continue until they input odd number
		while (usersize % 2 == 0) {
			System.out.println("Invalid figure size - must be an odd number");
			System.out.println(" ");
			System.out.print("Enter the size of the figure (odd number): ");
			usersize = scan.nextInt();
		}
		
		//Print menu
		System.out.println(" ");
		System.out.println("MENU:");
		System.out.println("1. Print box");
		System.out.println("2. Print diamond");
		System.out.println("3. Print X");
		System.out.println("4. Quit Program");
		System.out.println(" ");
		System.out.print("Please select an option: ");
			
		int useroption = scan.nextInt();
		
		//Check for user correct menu input
		while (useroption <= 0 || useroption >= 5) {
			System.out.print("Please enter a valid menu number: ");
			useroption = scan.nextInt();
		}	
		
		//Conditional statements for each user input option to call methods
		if (useroption == 1) {
			
			System.out.println(" ");
			Box userBox = new Box();
			userBox.size = usersize;
			userBox.printBox1();
			
		} else if (useroption == 2) {
			
			System.out.println(" ");
			printDiamond(usersize);
			
		} else if (useroption == 3) {

			char x = 'X';
			System.out.println(" ");
			printX(x, usersize);
			
		} else if (useroption == 4) {
			
			System.out.println(" ");
			System.out.println("Good bye!");
			System.exit(0);
			
		}
		scan.close();	
	}
	
	public static void printBox() {
		
		for (int a = 0; a < size; a++) {
			String line = " ";
			for (int b = 0; b < size; b++) {
				line += "X";
			}
			System.out.println(line);
		}
		
	}
	
	public static void printDiamond(int size) {
		
		for (int a = 1; a <= size; a++) {
			for (int b = size; b > a; b--) {
				System.out.print(" ");
			}
			System.out.print("X");
			for (int c = 1; c < 2*(a-1); c++) {
				System.out.print(" ");
			}	
			if (a == 1) {
				System.out.println(" ");
			} else {
				System.out.println("X");
			}
			}
		for (int a = size-1; a >= 1; a--) {
			for (int b = size; b > a; b--) {
				System.out.print(" ");
			}
			System.out.print("X");
			for (int c = 1; c < 2*(a-1); c++) {
				System.out.print(" ");
			}
			if (a == 1) {
				System.out.println("");
			} else {
				System.out.println("X");
			}
		}
		
	}
	
	public static void printX(char x, int usersize) {
		
		for (int a = 0; a < usersize; a++) {
			int b = usersize-1-a;
			for (int c = 0; c < usersize; c++) {
				if (c == a || c == b) {
					System.out.print(x);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}
	
}
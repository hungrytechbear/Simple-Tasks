import java.util.Scanner;		//import Scanner

public class Exercise {

	public static void main(String[] args) {
		
		boolean tog = true;
		while(tog) {
			Scanner input = new Scanner(System.in);
			char ch = input.nextLine().trim().toLowerCase().charAt(0);
			switch(ch) {
			case 'a':
				System.out.println("Hello, I am hungrybear. This is my coding exercise.\nIt is still undergoing development.");
				break;
				
				
			/* input 3 real (floating point) numbers x, y, z and output the
			 * largest of the three numbers and their average;
			 */
			case 'b':
				System.out.print("x = ");
				input = new Scanner(System.in);
				double x = input.nextDouble();
				System.out.print("y = ");
				input = new Scanner(System.in);
				double y = input.nextDouble();
				System.out.print("z = ");
				input = new Scanner(System.in);
				double z = input.nextDouble();
				if (x > y)
					if (x > z)
						System.out.println("Largest number is "+x);
					else
						System.out.println("Largest number is "+z);
				else
					if (y > z)
						System.out.println("Largest number is "+y);
					else
						System.out.println("Largest number is "+z);
				double avg = (x + y + z)/3;
				System.out.println("Average = "+avg);
				break;
				
			
			/* input 2 integer numbers m and n, and display all the numbers
			 * between m and n (both inclusive) with five numbers per
			 * line (note that the last line may have less than 5 numbers).
			 * At the end, display the sum of all the odd numbers between   
			 * m and n (both inclusive); 
			 */
			case 'c':
				System.out.print("m = ");
				input = new Scanner(System.in);
				int m = input.nextInt();
				System.out.print("n = ");
				input = new Scanner(System.in);
				int n = input.nextInt();
				if (n > m) {
					int count = 1;
					int sum = 0;
					for (int i = m; i < n + 1; i++) {
						System.out.print(i+" ");
						if (count%5 == 0)
							System.out.print("\n");
						count++;
						if (i%2 != 0)
							sum = sum + i;
					}
				System.out.println("\nSum of all odd numbers = "+sum);
				}
				else {
					int count = 1;
					int sum = 0;
					for (int i = n; i < m + 1; i++) {
						System.out.print(i+" ");
						if (count%5 == 0)
							System.out.print("\n");
						count++;
						if (i%2 != 0)
							sum = sum + i;
					}
				System.out.println("\nSum of all odd numbers = "+sum);
				}
				break;
				
				
			/* input 3 real numbers representing the sides of a triangle and   
			 * display the numbers together with a message indicating    
			 * whether or not the numbers form a triangle (Note: for the    
			 * numbers to form a triangle, the sum of any two sides must    
			 * be greater than the third side);
			 */
			case 'd':
				System.out.print("Left = ");
				input = new Scanner(System.in);
				double L = input.nextDouble();
				System.out.print("Right = ");
				input = new Scanner(System.in);
				double R = input.nextDouble();
				System.out.print("Centre = ");
				input = new Scanner(System.in);
				double C = input.nextDouble();
				System.out.println("Triangle sides: left="+L+" right="+R+" centre="+C);
				if (L+R > C && L+C > R && R+C > L)
					System.out.println("Congratulations, it is a triangle!");
				else
					System.out.println("Oops, this does not look like a triangle.");
				break;
				
				
			/* input an integer number n and determine whether or not n is a    
			 * prime number (Note: a number is a prime number if it is    
			 * greater than 1 and has no divisors other than 1 and itself) ;
			 */
			case 'e':
				System.out.print("n = ");
				input = new Scanner(System.in);
				n = input.nextInt();
				boolean checkprime = true;
				for (int i = n - 1; i > 1; i--) {
					if (n%i == 0)
						checkprime = false;
				}
				if (checkprime == false)
					System.out.println("n is not a prime number.");
				else
					System.out.println("n is a prime number.");
				break;
				
				
			// exit from the loop 
			case 'q':
				tog = false;
				break;
				
				
			// other: output an error message
			default:
				System.out.println("Error message!");
			}
		}

	}

}

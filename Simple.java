
public class Simple {

	public static void main(String[] args) {
		
		for (int i = 10; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.print("\n");
			for (int k = 11 - i; k > 0; k--) {
				System.out.print(" ");
			}
		}

	}

}

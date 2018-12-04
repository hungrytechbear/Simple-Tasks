import java.util.Scanner;

public class Mthree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int thou = 24, tmin = 60, tsec = 60, hou = 24, min = 60, sec = 60;
		String ohou = " ", omin = " ", osec = " ";
		
		for (int i = 0; i < n; i++) {
			String res = in.next();
			String[] a = res.split(":");
			for (int j = 0; j < a.length; j++) {
				if (j == 0) {
					thou = Integer.valueOf(a[j]);
				}
				else {
					if (j == 1) {
						tmin = Integer.valueOf(a[j]);
					}
					else {
						if (j == 2)
							tsec = Integer.valueOf(a[j]);
					}
				}
			}
			if (thou < hou) {
				hou = thou;
				min = tmin;
				sec = tsec;
			}
			if (thou == hou) {
				if (tmin < min) {
					min = tmin;
					sec = tsec;
				}
				if (tmin == min) {
					if (tsec < sec)
						sec = tsec;
				}
			}
		}
		ohou = String.valueOf(hou);
		omin = String.valueOf(min);
		osec = String.valueOf(sec);
		System.out.println(ohou+":"+omin+":"+osec);
	}
	  

}

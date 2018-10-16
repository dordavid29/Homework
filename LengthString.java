package homework_14_10;

import java.util.Scanner;

public class LengthString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter string: ");
		String st = scan.next();
		int numDivide = 1;
		char[] charArray = st.toCharArray();
		for (int i = st.length() / 2; i >= 2; i--) {
			if (st.length() % i == 0) {
				numDivide = i;
				for (int j = 0; j < charArray.length; j++) {
					System.out.print(charArray[j]);
					if ((j + 1) % numDivide == 0)
						System.out.println();
				}
				break;
			}
		}
		if (numDivide == 1)
			System.out.println(st);
		scan.close();
	}
}

package homework_14_10;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter string: ");
		String st1 = scan.nextLine();
		System.out.println("Please enter string: ");
		String st2 = scan.nextLine();
		char[] stNew = new char[st1.length()];
		char[] charArray1 = st1.toCharArray();
		char[] charArray2 = st2.toCharArray();
		for (int i = 0; i < charArray1.length; i++) {
			for (int j = 0; j < charArray2.length; j++) {
				if ((charArray1[i] != charArray2[j]) && (charArray2[j] != ' '))
					stNew[i] = charArray1[i];
				else
					break;
			}
		}
		for (int k = 0; k < stNew.length; k++) {
			System.out.print(stNew[k]);
		}
		scan.close();
	}
}
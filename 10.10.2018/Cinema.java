package class_10_10;

import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {

		Sit[][] cinema = new Sit[4][3];

		for (int row = 0; row < cinema.length; row++) {
			for (int seat = 0; seat < cinema[row].length; seat++) {
				cinema[row][seat] = new Sit((int) (Math.random() * 20) + 70, true);
			}
		}
		System.out.println("Hom many seat you need to buy? ");
		Scanner scan = new Scanner(System.in);
		int iNeed = scan.nextInt();

		for (int i = 1; i < iNeed; i++) {
			System.out.println("Please enter row (1-4): ");
			int row = scan.nextInt();
			if (row > 4)
				System.out.println("ERROR");
			System.out.println("Please enter seat (1-3): ");
			int seat = scan.nextInt();
			if (seat > 3)
				System.out.println("ERROR");
			cinema[row][seat].setOpen(false);
			iNeed--;
			System.out.println("OK");
			
			} else 
				System.out.println("Sorry, the seat is taken");
		}

	}

}

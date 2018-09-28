package j4;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x = input.nextInt();

		int z = 0;
		int y = 0;
		String bad;

		input.nextLine();

		int counter;

		String[] a = new String[x];

		for (counter = 0; counter < x; counter++) {

			a[counter] = (input.nextLine());
		}
		int c1 = a[0].charAt(0);
		int c2 = a[0].charAt((x * 2) - 2);
		int c3 = a[counter - 1].charAt(0);
		int c4 = a[counter - 1].charAt((x * 2) - 2);

		if ((c1 < c2) && (c1 < c3) && (c1 < c4)) {

			for (x = 0; x < counter; x++)
				System.out.println(a[x]);
		}

		else if ((c2 < c1) && (c2 < c3) && (c2 < c4)) {

			for (y = 2; y < ((x * 2) + 1); y += 2) {

				for (z = 0; z < counter; z++) {

					System.out.print(a[z].charAt((x * 2) - y) + " ");
				 
				
			}
		}

		else if ((c3 < c1) && (c3 < c2) && (c3 < c4)) {

		}

		else if ((c4 < c1) && (c4 < c2) && (c4 < c3)) {
		}
	}
}
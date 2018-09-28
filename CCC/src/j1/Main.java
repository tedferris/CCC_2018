package j1;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();

		if ((num1 == 8 || num1 == 9) && (num2 == num3) && (num4 == 8 || num4 == 9)) {

			System.out.print("ignore");
		}

		else {
			System.out.print("answer");
		}
	}
}

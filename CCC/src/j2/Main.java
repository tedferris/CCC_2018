package j2;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int spots = input.nextInt();

		String day1 = input.next();
		String day2 = input.next();

		int counter = 0;
		int spotcounter = 0;

		for(;counter < spots; counter++) {
			
			if(day1.charAt(counter) == 'C' && day2.charAt(counter) == 'C') {
				
				spotcounter++;
			}
		}
		System.out.print(spotcounter);
	}
}

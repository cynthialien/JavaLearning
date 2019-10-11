/**
 * 
 */
package cynthia.lesson;

/**
 * @author Cynthia
 *
 */
public class LessonThree {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i <= 100; i++) {

			sum = sum + i;
		}
		System.out.println(sum);

		// Draw following symbol
		/*
		 * *
		 * ** 
		 * *** 
		 * **** 
		 * *****
		 */
		/*
		char x = '*';
		String y = "**";
		*/
		
		/*
		System.out.print("1");
		System.out.print("2");
		System.out.println("3");
		System.out.print("4");
		System.out.print("5");
		System.out.println("6");
		*/
		
		for (int i = 1; i <= 5; i++) {
			for (int x =0 ; x <i ; x++)	{
				System.out.print("*");
			}
			System.out.println();
			
		}
		

		// Draw following symbol
		/*
		 * *
		 * ** 
		 * *** 
		 * **** 
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		
		
		
	}
}

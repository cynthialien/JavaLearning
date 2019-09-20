/**
 * 
 */
package cynthia.lesson;

/**
 * @author Cynthia
 *
 */
public class LessonTwo {
	
	private static int a = 0;
	private static int b = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {// main method
		
		System.out.println("before a = "+ a);
		System.out.println("before b = "+b);
		
		if ((a == 0) || (addB()) )	{
			System.out.println("line 28");
		}else	{
			System.out.println("line 30");
		}
		
		
		System.out.println("after a = "+a);
		System.out.println("after b = "+b);
	}
	
	private static boolean addA()	{
		a = a +1 ;
		return true;
	}
	
	private static boolean addB()	{
		b = b +1 ;
		return true;
	}

}

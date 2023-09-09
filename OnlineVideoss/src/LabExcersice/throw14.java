/*14. Write a try-catch block to calculate the factorial of the entered number. An exception 
should be handled if the entered number is negative. Use the Exception class.  
*/
package LabExcersice;

public class throw14 {
	
	public static void main(String[] args) {
		int n=-6;
		try {
			if(n>0) {
				throw new Exception("Number never be Negetive");
			}
			
				else {
					int factorial = 1;
					for(int i=1;i<=n;i++)
					{
							factorial=factorial *i;
					}
					System.out.println(factorial);
			}
		}
			catch(Exception X) {
				System.out.println(X);
			}
	}

}

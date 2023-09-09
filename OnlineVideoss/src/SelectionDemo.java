
public class SelectionDemo {
public static void main(String[] args) {
	
	/* IF ELSE
	if(true)
		System.out.println("Hello");
	if(false)
		System.out.println("Bye"); 
		*/
	/*
	 * int n = 3;
	if (n==0) {
		System.out.println("Nothing");
		System.out.println("bye");
		}
	else if(n%2==0)
		System.out.println("Even number");
	
	else // (n%2!=0)
		System.out.println("Odd number");	
		
		
	//TERNERY OPERATOR
	//?: ->condition ?expr1:expr2
	int i = 5;
	
	int j = 0;
	
	if (i>6)
		j=1;
	else
		j=2; 
	
	j = i>6?1:2;
	System.out.println(j);
	*/
	
	// SWITCH STATEMENT
	
	int n = 6;
	
	
	switch(n) 
	{
	case 1 :				
		System.out.println("One");
		break;
	case 2 :
		System.out.println("Two");
		break;
	case 3 :
		System.out.println("Three");
		break;
	case 4 :
		System.out.println("Four");
		break;
	case 5 :
		System.out.println("Five");
		break;
	default : 
		System.out.println("No Match");
}
}
}

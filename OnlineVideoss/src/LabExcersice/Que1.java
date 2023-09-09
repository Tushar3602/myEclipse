package LabExcersice;

public class Que1 {
	public static void main(String[] args) {
		
	
		int even=0;
		int odd=0;
		int prime=0;
		int number = 1;  
		for(int i=1;i<=15;i++)
		{
			if(i%2==0){
				even+=i;
			}
			else{
				odd+=i;
			}
		}
		while(number <= 15)  
		{  
		int count = 0;  
		int j = 2;  
		while(j <= number/2 )  
		{         
		if(number % j == 0)  {    
		count++;  
		break;  
		}  
		
		j++;  
		} 
		if(count == 0 && number != 1 )            
		{  
		prime+=number;  
		}   
		number++;  
	}	
		System.out.println("Even numbers sum is- "+even);
		System.out.println("Odd numbers sum is- "+odd);
		System.out.println("Prime numbers sum is- "+prime);
	}
}



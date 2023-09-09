package Practice;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Demonstrating method from StringTokenizer class"," ");
		while (st.hasMoreTokens())   
	     {    
	         System.out.println(st.nextToken());    
	     }  

		Iterator i=st.iterator();
		while(i.hasNext()){
			System.out.println(i.hasNext()+"  ");
		}
		Iterator i=st.iterator();
		while(i.hasNext()){
			System.out.println(i.next()+" ");

	}

	}}

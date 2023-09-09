
import java.util.StringTokenizer;

public class ReverseString {
	public static void main(String args[]) {
		String s = "Hello ! How are You ?";
		StringTokenizer st = new StringTokenizer(s);
		String reverseMessage = "";
		while (st.hasMoreTokens()) {
			reverseMessage = st.nextToken() + " " + reverseMessage;
		}
		System.out.println("Original String is :" + s);
		System.out.println("Reversed String is :" + reverseMessage);
	}
}
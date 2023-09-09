	package newphase;

public class myCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('A');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonent());
	//System.out.println(myChar.isNumber());
		//System.out.println(myChar.isAlphabet());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
		

	}

}

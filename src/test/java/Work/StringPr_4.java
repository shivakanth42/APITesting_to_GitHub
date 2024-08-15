package Work;

public class StringPr_4 {


	//Print character ASCII value
	public void charASCII() {
		String s = "abcdef";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
//			System.out.println(c+" "+(int)c);
		}
	}


	//Print uppercase characters from sentense
	public void uppercaseFromSentense() {
		String s = "abCDefX12Y", w="", v="";
		
		//With ASCII values
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			int anscii = (int)c;
			if(anscii>64 && anscii<91) {
				w=w+c;
			}
		}
		System.out.println(w);
		
		
		//Or
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {    //Also we can check with .isLowerCase(c) , .isDigit(c), .isLetterrDigit(c), .isAlphabetic(c), .isWhitespace()
				v=v+ch;
				}
		}
		System.out.println(v+"\n");
	}

	
	
	//Print owels and count
	public void owels() {
		String s = "AbEcIdOfUxyzaeiou", w="";
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.toUpperCase().charAt(i);
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				count++;
				w=w+s.charAt(i);
			}			
		}
		System.out.println(w);
		System.out.println("Total no of owels are: "+count+"\n");
		}


	
	
	
	
	
	public static void main(String[] args) {

		StringPr_4 obj = new StringPr_4();
		obj.charASCII();
		obj.uppercaseFromSentense();
		obj.owels();


	}

}

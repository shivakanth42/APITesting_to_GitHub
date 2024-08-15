package Work;

public class String_Demo {

	public static void duplicateItsCount() {
		String s = "abcabc", w="";
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					w=w+s.charAt(i);
					count++;
				}
			}
		}System.out.println(count);
		System.out.println(w+"\n");
		
	}
	
	public static void reverseWordsInString() {

		String s = "abc xyz", w="";
		
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i)!=' ') {
				w=w+s.charAt(i);
			}
			
		}System.out.println(w+"\n");
		
	}
	
	
	public static void removeSpecialChars() {
		
		String s = "S@i#v&a";
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", "")+"\n");
		
	}
	
	
	
	public static void removeDuplicateChars() {
		
		String s= "sivasxsiva", w="";
		int count=0;
	
		
		
		System.out.println(w);
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {

		String_Demo.duplicateItsCount();
		String_Demo.reverseWordsInString();
		String_Demo.removeSpecialChars();
		String_Demo.removeDuplicateChars();
		
	}

}

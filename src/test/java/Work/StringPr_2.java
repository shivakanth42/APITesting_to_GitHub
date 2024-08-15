package Work;


public class StringPr_2 {


	//Print words which has given character/s
	public void charsReading() {
		String s = "abc def ghi";
		String w = "";		
		s+=" ";  	//There is no space after last word, so add space explicitly before the loop
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				w = w+s.charAt(i);
			}
			else {
				//				System.out.println(w);   //Prints each word separately
				//				System.out.println(w.charAt(0));		//Prints first character(index based) of each word
				//				System.out.println(w.substring(0, 2));  //Prints (fromindex to endindex-1) of each word


				/*Prints words with:
				w.startsWith("a")
				w.endsWith("ef")
				w.contains("g");				
				 */
				if(w.startsWith("a"))   
//					System.out.println(w);


				w = "";		//Update w value to empty for each word
			}}}


	
	//Word starts with "w" and word length is 3
	public void length3AndStartswithW() {
	String x="win asdf won ihhsd wi lksdgffndf was";
	x=x+" ";
	String s="";
	
	for(int i=0; i<x.length(); i++) {
		
		if(x.charAt(i)!=' ') {
			s=s+x.charAt(i);
//			System.out.println(s);
		}
		
		else {
			if(s.length()==3) {
				if(s.startsWith("w")) {
					System.out.println(s);
					s="";
				}
				
			}
			else {
				s="";
			}
		}
		}
		
	}
	
	//Print words which has given no of chars
	public void printWordsWithThreeChars() {
		String s = "abc deff ijka adf",  w = "";

		s+=" ";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				w=w+s.charAt(i);
			}
			else {
				if(w.length()==3)
//					System.out.println(w);
			w="";
		}}}


	
	
	//Print longestword from the sentense
	public void longestWord() {
		String s = "ab abjkhic abcde ihgt", w="", lw="";
		
		s+=" ";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				w=w+s.charAt(i);
			}
				else {
					if(w.length()>lw.length()) {
						lw=w;
						w="";
				}
			}
		}
//		System.out.println(lw);
	}



//Check given word present in the sentense or not
	public void wordPresentOrNot() {
		String s = "abc ghi xyz ghi def ghi", w=""; int count=0;
		
		s+=" ";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				w=w+s.charAt(i);
			}
			else {
					if(w.equalsIgnoreCase("ghi")) {    //Check ghi word present or not
					System.out.println(w);
					count++;						   //Count value increases for every word found
					}
					w="";
		}
		}System.out.println("No of words found with word ghi are : "+count);
  
}


	



	public static void main(String[] args) {

		StringPr_2 obj = new StringPr_2();
		obj.charsReading();
		obj.printWordsWithThreeChars();
		obj.longestWord();
		obj.wordPresentOrNot();
		System.out.println("\n");
		obj.length3AndStartswithW();




	}

}

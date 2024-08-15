package Work;

public class Demo {

	
	
	
	public static void main(String[] args) {

		String s = "abc def ghi";
		s=s+" ";  	//There is no space after last word, so add space explicitly before the loop
		
		String w = "";		
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				
				w = w+s.charAt(i);   //w=def
			}
			else {								
				
				if(w.startsWith("a"))   
					System.out.println(w);  //w=abc
						//Update w value to empty for each word  w="";
			}}w = "";
		
	}
	
		
		
	}	
		
	



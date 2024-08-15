package Work;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringPr_3 {


	//Replace a word with new word
	public void replaceWordWithAnotherWord() {
		String s = "Red Green", w="", ns="";
		s+=" ";

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				w=w+s.charAt(i);
			}
			else {
				if(w.equalsIgnoreCase("Red")) {
					ns=ns+"Blue"+" ";
				}
				else {
					ns=ns+" "+w+" ";
				}
			}
		}
		//		System.out.println(ns);
	}



	//Delete the given word from sentense
	public void deleteWord() {
		String s="abc xyz abc", w="", ns="";
		s+=" ";

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				w=w+s.charAt(i);
			}
			else{
				if(!w.equalsIgnoreCase("xyz")) {
					ns=ns+w+" ";
				}
				w="";
			}	
		}
		//		System.out.println(ns);

	}



	//To uppercase for every odd word from sentense
	public void caseSensitive() {
		String s = "abc xyz def", w="", ns="";
		s+=" "; int count=0;

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				w=w+s.charAt(i);
			}
			else if(count++%2==0) {
				ns=ns+w.toUpperCase()+" ";
				w="";
			}
			else {
				ns=ns+w.toLowerCase()+" ";
				w="";
			}}
		

		System.out.println(ns+"\n");
	
	}



	
	//First character to uppercase and rest are lowercase
	public void fisrtCharOnlyToUpper() {
		String s = "shashi siva krishna", w="", ns="";
		s+=" ";

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				w=w+s.charAt(i);
			}
			else{
				char c = w.charAt(0);   		//First char to uppercase
				c = Character.toUpperCase(c);   //using Character datatype changing to uppercase
				ns=ns+c+w.substring(1)+" ";		//Here w.substring(1) means characters from "index 1 to end" will capture
				w="";
			}
			}System.out.println(ns);
			
			
			
		}	
	

	

	public static void main(String[] args) {

		StringPr_3 obj = new StringPr_3();
		obj.replaceWordWithAnotherWord();
		obj.deleteWord();
		obj.caseSensitive();
		obj.fisrtCharOnlyToUpper();
		

	}

}

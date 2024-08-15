package Work;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class StringPr {

	public void reverseString(){

		//Without StringBuilder
		String name = "siva";
		String str = "";
		for(int j=name.length()-1; j>=0; j--) {
			str=str+name.charAt(j);  
		}
		System.out.println(str);

		//With StringBuilder
		String s = "shashi";     
		StringBuilder sb = new StringBuilder();

		for(int i = s.length()-1; i >=0; i-- ){
			sb.append(s.charAt(i));
		}
		System.out.println(sb+"\n");    //Also System.out.println(sb.toString());

	}
	//Reversing a string Without using loop/built in functions
	/*public static void continueThisSteps(char[] arr, int arrlength)
	{
		String w="";
		if(arrlength>0) {
			System.out.println(arr[arrlength-1]);
			arrlength--;
			continueThisSteps(arr, arrlength);
			}	
	}

	public static void main(String[] args) {

		String stri = "abcdef";
		char[] arr = stri.toCharArray();
		int arrlength = arr.length;
		continueThisSteps(arr, arrlength);		
	}
}*/



	public void reverseWordsInString() {

		String s = "abc xyz";
		String[] breakAtSpace = s.trim().split("\\s");
		StringBuilder sb = new StringBuilder();
		int length = breakAtSpace.length;

		for (int i = length - 1; i >= 0; i--) {
			sb.append(breakAtSpace[i]);
			sb.append(' ');
		}
		System.out.println("reverseWordsInString: "+sb.toString());
		System.out.println("\n");
	}



	public void duplicateCharacterAndItsCount(){
		String s = "Phone";
		Map<Character,Integer > dupchar = new HashMap<Character,Integer>();
		char[] stringToCharArray = s.toLowerCase().toCharArray();

		for(Character ch : stringToCharArray){
			if(dupchar.containsKey(ch)){
				dupchar.put(ch, dupchar.get(ch)+1);
			}else
			{
				dupchar.put(ch, 1);
			}
		}

		//printing character and value

		Set<Character> keys = dupchar.keySet();
		for(Character ch : keys){

			if(dupchar.get(ch) > 1)
			{
				System.out.println(ch+","+dupchar.get(ch));

			}


		}System.out.println("\n");
	}


	public void findDuplicateWordInStringWithCount(){

		String s = "one two one three";  //Here "one" is the duplicate word to print
		String[] brokenString = s.toLowerCase().trim().split(" ");

		Map<String, Integer> mapobj = new HashMap<String, Integer>();

		for(String each : brokenString) {
			Integer old = mapobj.get(each);

			if(old == null) {
				old = 0;
			}

			mapobj.put(each, old+1);
		}
		System.out.println("All the words with thier count"+mapobj);  //To print all words with their count
		System.out.println("\n");

		Set<String> keys = mapobj.keySet();
		for(String ch : keys){

			if(mapobj.get(ch) > 1)
			{
				System.out.println(ch+" "+ mapobj.get(ch)); //To print only duplicate words with their count

			}

		}System.out.println("\n");

	}



	public void twoStringsEqualOrNot() {
		String a = "abd";
		String b = "abc";
		boolean condition = true;

		if(a.length()!=b.length()) {
			System.out.println("Lengths are not equal, so both the strings different");


		}else {
			for(int i=0; i<=a.length()-1; i++) {
				if(a.charAt(i)!=b.charAt(i)) {
					condition = false;
					break;
				}
			}
			if(condition==false) {
				System.out.println("twoStringsEqualOrNot: Strings are different");
			}else{
				System.out.println("twoStringsEqualOrNot: Strings are same");
			}
		}
		System.out.println("\n");
	}


	public void removeDuplicateChars() {
		String s = "programming";
		StringBuilder sb = new StringBuilder();

		s.chars().distinct().forEach(c -> sb.append((char)c));
		System.out.println("removeDuplicateChars: "+sb);

		//Using Set interface
		StringBuilder sbset = new StringBuilder();
		Set<Character> set = new LinkedHashSet();
		for(int i=0; i<=s.length()-1; i++) {
			set.add(s.charAt(i));
		}
		for(Character ch : set) {
			sbset.append(ch);
		}System.out.println("removeDuplicateChars: "+sbset);
		System.out.println("\n");

	}


	public void sortString() {
		String s = "zazaza";
		char arr[] = s.toCharArray();
		char temp;

		for(int i=0; i<=s.length()-1; i++) {
			for(int j=i+1; j<=s.length()-1; j++) {
				if(arr[i]>arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}System.out.println("sortString: "+new String(arr));
		//System.out.println(arr);  //Same as above
		//		System.out.println(Arrays.toString(arr));

		//Using sort method
		Arrays.sort(arr);
		System.out.println("sortString: "+new String(arr));  //Using sort method
		System.out.println("\n");

	}


	public void countNoOfWords() {
		String s = "Welcome to the world";
		int count=1;

		for(int i=0; i<s.length()-1; i++) {
			if(  (s.charAt(i)==' ' && s.charAt(i+1)!=' ')  ) {
				count++;
			}
		}System.out.println("countNoOfWords: "+count);
	}




	public static void main(String[] args) {


		StringPr obj = new StringPr();
		obj.reverseString();
		obj.reverseWordsInString();
		obj.duplicateCharacterAndItsCount();
		obj.findDuplicateWordInStringWithCount();
		obj.twoStringsEqualOrNot();
		obj.removeDuplicateChars();
		obj.sortString();
		obj.countNoOfWords();
	}

}

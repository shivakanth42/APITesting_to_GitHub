package Work;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DFD {
	
	public static void findDuplicateWordInStringWithCount(){

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
	
	
	//Duplicate letter and its count
	public static void DuplicateLetterAndCount(){
	String s = "Phonesspe";
	char[] sToa = s.toLowerCase().toCharArray();
	
	Map<Character,Integer > dupchar = new HashMap<Character,Integer>();

	for(Character ch : sToa){
		if(dupchar.containsKey(ch)){
			dupchar.put(ch, dupchar.get(ch)+1);  //[p, 2]
		}else
		{
			dupchar.put(ch, 1);  //[p, 1]
		}
	}
	
	Set<Character> keys = dupchar.keySet();
	for(Character ch : keys){

		if(dupchar.get(ch) > 1)
		{
			System.out.println(ch+","+dupchar.get(ch));

		}
		
	}
	}


	
	public static void main(String[] args) {
		DFD.DuplicateLetterAndCount();
		DFD.findDuplicateWordInStringWithCount();
		
		
		
	}
}
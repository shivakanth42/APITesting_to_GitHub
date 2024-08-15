package Work;

import java.util.Arrays;

public class array_1 {

	
	//We can check whether the letter is upper or lower with the condition "Character.isUppercase(c)"/.isLowercase(c)
	//We can change upper to lower vice versa by "Character.toUppercase(c)/.toLowercase(c)"
	//Where (c) is the letter captured from string or array and stored in char variable
	
	
	
	//Print even no's then odd no's
	public void oddThenOddIndexes() {
		int arr[] = {1, 2, 3, 4, 5, 6};

		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {		//Prints even no's
				System.out.println(arr[i]);
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {		//Prints odd no's
				System.out.println(arr[i]);
			}		
		}
	}


	//Print two digit no's
	public void printTwoDigitNo() {
		int arr[] = {10, 2, 30, 4, 5, 60, 1000};
		for(int i=0; i<arr.length; i++) {

			/*Below condition captures two digit no's from array also we have conditions like
			arr[i]>o for positive no; arr[i]%5==0 which divisible by 5; arr[i]%10==7 which number ends with 7 */
			if(arr[i]>9 && arr[i]<100) {
				System.out.println(arr[i]);
			}
		}		
	}


	//Sum of even numbers
	public void sumOfEvenNo() {
		int arr[]= {1, 2, 3, 4, 5, 6};
		double sum = 0;
		for(int i=0; i<arr.length; i++) {

			/*Condition to capture even numbers we can also use
			Sum of odd no's; sum of 2 digit no's; sum of positive no's*/
			if(arr[i]%2==0) {    
				sum=sum+arr[i];

			}
		}System.out.println(sum);	//Outcome is 2+4+6=12	
	}


	//Product/multiply of all even nos'
	public void productOfEvenNo() {
		int arr[]= {1, 2, 3, 4, 5, 6};
		double product = 1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				product=product*arr[i];
			}
		}System.out.println(product);  //Outcome is 2*4*6 = 48
	}


	//Find min and max number in an array
	public void findMinAndMaxNo() {
		int arr[]= {111, 8, 1, 24, -6, 5, 6, 150};
		int min=arr[0], max=arr[0];

		for(int i=1; i<arr.length; i++) {   //Start iteration from second position
			if(arr[i]>max) {
				max=arr[i];
			}
			else{
				if(arr[i]<min) {
					min=arr[i];
				}
			}
		}System.out.println("Max no is: "+max);
		System.out.println("Min no is: "+min);
	}		


	//Print uppercase characters in an array
	public void uppCharsInArray() {
		int arr[]= {'s', 1, 'I', 2, 'V', 3, 'A', 4};
		char c=' ';
		String s="";
		for(int i=0; i<arr.length; i++) {
			//Check index is uppercase or not, also isLowercase, isDigit, !.isSpace, .isWhitespace() to remove spaces
			if(Character.isUpperCase(arr[i])) {
//				s=s+arr[i];
				c = (char) arr[i];
				s=s+c;
				
			}
		}
		System.out.println(s);
}
	
	
	public void exception() {
		int i=10;
		int k;
		
		try {
			k=i/0;
			System.out.println("This is try block");
		} catch (NullPointerException e) {
			System.out.println("This is catch block");
		}
		finally {
			System.out.println("This is finally block");
		}
		

	}



	public static void main(String[] args) {
		array_1 obj = new array_1();
//		obj.oddThenOddIndexes();
//		obj.printTwoDigitNo();
//		obj.sumOfEvenNo();
//		obj.productOfEvenNo();
//		obj.findMinAndMaxNo();
//		obj.uppCharsInArray();
		obj.exception();

		
	}	
	}
	



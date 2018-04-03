import java.util.Scanner;
public class Decryption{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	//System.out.println("Enter Four Digits Encrypted Integers");
	//int number = scan.nextInt();
	
	int dig1 =9;
	int dig2 =8;
	int dig3 =1;
	int dig4 =0;

	

	System.out.println("before swap 1st Digit Number is "+dig1); 
	System.out.println("before swap 2nd Digit Number is "+dig2); 
	System.out.println("before swap 3rd Digit Number is "+dig3);
	System.out.println("before swap 4th Digit Number is "+dig4); 	
	
	int temp1 = 0;
	temp1 = dig1;
	dig1 = dig3;
	dig3 = temp1;

	int temp2 = 0;
	temp2 = dig2;
	dig2 = dig4;
	dig4 = temp2;

	System.out.println("after again re-swap 1st Digit Number is "+dig1); 
	System.out.println("after again re-swap 2nd Digit Number is "+dig2); 
	System.out.println("after again re-swap 3rd Digit Number is "+dig3);
	System.out.println("after again re-swap 4th Digit Number is "+dig4); 

	dig1 = dig1 % 10;
	dig2 = dig2 % 10;
	dig3 = dig3 % 10;
	dig4 = dig4 % 10;
	
	System.out.println("after reminder 1st Digit Number is "+dig1); 
	System.out.println("after reminder 2nd Digit Number is "+dig2); 
	System.out.println("after reminder 3rd Digit Number is "+dig3);
	System.out.println("after reminder 4th Digit Number is "+dig4); 

	dig1 = dig1 + 7;
	dig2 = dig2 + 7;
	dig3 = dig3 + 7;
	dig4 = dig4 + 7;

	System.out.println("after Adding 1st Digit Number is "+dig1); 
	System.out.println("after Adding 2nd Digit Number is "+dig2); 
	System.out.println("after Adding 3rd Digit Number is "+dig3);
	System.out.println("after Adding 4th Digit Number is "+dig4); 

	dig1 = dig1 % 10;
	dig2 = dig2 % 10;
	dig3 = dig3 % 10;
	dig4 = dig4 % 10;
	
	System.out.println("after reminder 1st Digit Number is "+dig1); 
	System.out.println("after reminder 2nd Digit Number is "+dig2); 
	System.out.println("after reminder 3rd Digit Number is "+dig3);
	System.out.println("after reminder 4th Digit Number is "+dig4); 

	dig1 = dig1 + 6;
	dig2 = dig2 + 6;
	dig3 = dig3 + 6;
	dig4 = dig4 + 6;	
	System.out.println("after Adding 6 1st Digit Number is "+dig1); 
	System.out.println("after Adding 6 2nd Digit Number is "+dig2); 
	System.out.println("after Adding 6 3rd Digit Number is "+dig3);
	System.out.println("after Adding 6 4th Digit Number is "+dig4); 

	dig1 = dig1 % 10;
	dig2 = dig2 % 10;
	dig3 = dig3 % 10;
	dig4 = dig4 % 10;

	System.out.println("than performing mode operation 1st Digit Number is "+dig1); 
	System.out.println("than performing mode operation 2nd Digit Number is "+dig2); 
	System.out.println("than performing mode operation 3rd Digit Number is "+dig3);
	System.out.println("than performing mode operation 4th Digit Number is "+dig4); 


	}
}
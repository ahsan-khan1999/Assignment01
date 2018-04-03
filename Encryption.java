import java.util.Scanner;
public class Encryption{
	public static void main(String[] args){
	Scanner object = new Scanner(System.in);
	System.out.println("Enter Four Digit Number which you want to encrypt!!!!");
	int num = object.nextInt();
	
		int dig1 = num % 10;
	num = num / 10;
		int dig2 = num % 10;
	num = num / 10;
		int dig3 = num % 10;
	num = num / 10;
		int dig4 = num % 10;
	num = num / 10;
		System.out.println("1st Digit Number is "+dig1); 
		System.out.println("2nd Digit Number is "+dig2); 
		System.out.println("3rd Digit Number is "+dig3); 
		System.out.println("4th Digit Number is "+dig4); 
		
		dig1 = dig1 + 7;
	dig2 = dig2 + 7;
		dig3 = dig3 + 7;
	dig4 = dig4 + 7;
		System.out.println("1st Digit Number is "+dig1); 
		System.out.println("2nd Digit Number is "+dig2); 
		System.out.println("3rd Digit Number is "+dig3); 
		System.out.println("4th Digit Number is "+dig4); 

	dig1 = dig1 % 10;
		dig2 = dig2 % 10;	
	dig3 = dig3 % 10;
		dig4 = dig4 % 10;

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
		System.out.println("after swap 1st Digit Number is "+dig1); 
		System.out.println("after swap 2nd Digit Number is "+dig2); 
		System.out.println("after swap 3rd Digit Number is "+dig3); 
		System.out.println("after swap 4th Digit Number is "+dig4); 

		System.out.println("Encrypted Integers is "+dig1+dig2+dig3+dig4); 
}
}
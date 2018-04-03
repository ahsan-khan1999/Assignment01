import java.util.Scanner;
public class ShippingCost{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter The Weight Of Parcel in Pounds");
	int weight = input.nextInt();
	
	if((float)weight > 0 && weight <= 1){
	System.out.println("The Amount For Shipping Parcel is 30.5");
	
}
	else if(weight > 1 && weight <= 3){
	System.out.println("The Amount For Shipping Parcel is 50.5");
}
	else if(weight > 3 && weight <= 10){
	System.out.println("The Amount For Shipping Parcel is 80.5");
}
	else if(weight > 10 && weight <= 20){
	System.out.println("The Amount For Shipping Parcel is 100.5");
}
	else{
	System.out.println("Well this parcel cannot be shipped!!Thanku");	
}




}
}
import java.util.Scanner;
public class CreditLimitCalculator{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter yours Account Number");
	int acc_no = scan.nextInt();
	System.out.println("Balance at the beginning of the month");
	float begining_bal = scan.nextFloat();
	System.out.println("total of all items charged by the customer this month");
	int total_items = scan.nextInt();
	System.out.println("total of all credit applied to the customer this month");
	float total_credit = scan.nextFloat();	
	System.out.println("Allowed credit limit");
	float credit_limit = scan.nextFloat();	


	float new_balance = 0;
	new_balance = begining_bal + total_items - total_credit;
	
	System.out.println("New Balance is "+new_balance);
	if (credit_limit > 5000){
	
	System.out.println("you have exceded the Allowed credit limit");
	}	

}
}
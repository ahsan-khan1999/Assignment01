import java.util.Scanner;
public class EmployeeBonous{
	
	
	public static void main(String[] args){


	Scanner input=new Scanner(System.in);
	System.out.println("Enter Grade ");
	String grade= input.nextLine();
		
	//permenent employee per day 5000;
	//permenent employee per day allonice 500;
	//for night shift 10% extra pay;

	

	if(grade.equals("A1"))
	{
		System.out.println("Enter 1 For permenent employee and 0 for temperary employee");
		int in = input.nextInt();
			if (in == 1){
		double mypackage=5000.00;
		double allowance_travel = 500.00;
		mypackage = 0.05 * 5000;
		allowance_travel = 0.05 * 500;
		double nightshiftpay;
		//cal pay 10% AMOUNT of perment employee;
		nightshiftpay = 0.1 * 5000;
		  
		System.out.println("package amount of perment employee is "+mypackage);
		System.out.println("Travel allowance of permenent employee is "+allowance_travel);
		System.out.println("10% pay of permenent employee is "+nightshiftpay);
			}
	}
		else{ 
	double mypackage=3000.00;
		double allowance_travel = 300.00;
		mypackage = 0.05 * 3000;
		allowance_travel = 0.05 * 300;
		double nightshiftpay;
		//cal pay 10% AMOUNT of perment employee;
		nightshiftpay = 0.1 * 3000;
		  
		System.out.println("package amount of perment employee is "+mypackage);
		System.out.println("Travel allowance of permenent employee is "+allowance_travel);
		System.out.println("10% pay of permenent employee is "+nightshiftpay);
}
		if(grade.equals("A2")){
		System.out.println("Enter 1 For permenent employee and 0 for temperary employee");
		int in = input.nextInt();
		if (in == 1){
		double mypackage=5000.00;
		double allowance_travel = 500.00;
		mypackage = 0.1 * 5000;
		allowance_travel = 0.1 * 500;
		double nightshiftpay;
		//cal pay 10% AMOUNT of perment employee;
		nightshiftpay = 0.1 * 5000;
	}
}
		else{
		double mypackage=3000.00;
		double allowance_travel = 300.00;
		mypackage = 0.1 * 3000;
		allowance_travel = 0.1 * 300;
		double nightshiftpay;
		//cal pay 10% AMOUNT of perment employee;
		nightshiftpay = 0.1 * 3000;
}

		if(grade.equals("A3")){
		System.out.println("Enter 1 For permenent employee and 0 for temperary employee");
		int in = input.nextInt();
		if (in == 1){
		double mypackage=5000.00;
		double allowance_travel = 500.00;
		mypackage = 0.15 * 5000;
		allowance_travel = 0.15 * 500;
		double nightshiftpay;
		//cal pay 10% AMOUNT of perment employee;
		nightshiftpay = 0.15 * 5000;
}
}
		else{
		double mypackage=3000.00;
		double allowance_travel = 300.00;
		mypackage = 0.15 * 3000;
		allowance_travel = 0.15 * 300;
		double nightshiftpay;
		//cal pay 10% AMOUNT of perment employee;
		nightshiftpay = 0.15 * 3000;
}
	}
	
}
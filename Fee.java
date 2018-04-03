import java.util.Scanner;
public class Fee{
	public static void main(String[] args)
	
{	
	int years =0;
	
	double tution_fee=1000000;
	double percent =0.07 * 1000000;
	System.out.println("Tution Fee 7% is"+percent);
	Scanner scan= new Scanner(System.in);
	
		int i =0;
		while(i<100){
		tution_fee = tution_fee + percent;		
		years++;
		if (tution_fee >= 2000000){
		break;
	
	}


}
		System.out.println("no of years"+years);		
		
}
}

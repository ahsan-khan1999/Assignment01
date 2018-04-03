import java.util.Scanner;
public class ResearchData{
	public static void main(String[] args){
		Scanner my=new Scanner(System.in);
		System.out.println("enter minimun temp of Loacality");
			float min_temperature = my.nextFloat(); 
		System.out.println("enter max temp of loacality");
			float max_temperature = my.nextFloat();
		System.out.println("enter average temp of loacality");
			float avg_temperature = my.nextFloat();
		System.out.println("Enter Population of town");
			float population = my.nextFloat();
		System.out.println("Enter Population of state");
			float statee = my.nextFloat();
		System.out.println("Enter the city press 1 for metropolic and 0 for other");
			int city = my.nextInt();
	
	if (city == 1){
		System.out.println("City is metropolic");
}
	else if(city == 0){
		System.out.println("City is not metropolic");
	}
	else{
	System.out.println("Im=nvalid Input Mask");}
	
		System.out.println("Enter Literecy number of city");
	
			float litrecy = my.nextFloat();
		
		System.out.println("enter average Qualification of Population");
		
		System.out.println("Enter 1 for Graduate and 0 for Post_Graduate");
	
		int qualification = my.nextInt();
	
	if (qualification == 1){
	System.out.println("Average Qualification is Graduate");
	}
	else if(qualification == 0){
	
		System.out.println("Average qualification is Post_Graduate\n");
	}
	else{
		System.out.println("Im=nvalid Input Mask");}
	
	

}
}
import java.util.*;
	class Problem17{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter salary and year of service");
			double salary=sc.nextDouble();
			int yearOfService=sc.nextInt();
			int bonus=0;
			if(yearOfService>5){
			bonus=5;
			}else {
			System.out.println("No bonus");
			}
			double bonusAmount=(double)bonus/100*salary;
			System.out.println("Bonus amount is "+bonusAmount);
	}
}
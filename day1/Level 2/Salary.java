import java.util.*;
	class Salary{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter Salary");
			int salary=sn.nextInt();
			System.out.println("Enter Bonus");
			int bonus=sn.nextInt();
			int total=salary+bonus;
			System.out.println(" The salary is INR " + salary+ " and bonus is INR " + bonus+ ". Hence Total Income is INR " + total);
    }
}	
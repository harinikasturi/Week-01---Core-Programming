import java.util.*;
	class Divisionoperator{
		public static void main(String[] args){
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1=sn.nextInt();
		int num2=sn.nextInt();
		int quotient=num1/num2;
		int remainder=num1%num2;
		System.out.println("The Quotient is " + quotient + " and Reminder is " +remainder+ " of two number " + num1 + " and " +num2);
	}
}
		
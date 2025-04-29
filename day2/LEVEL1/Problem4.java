import java.util.*;
	class Problem4{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the number");
			int num1=sn.nextInt();
			if (num1>0){
			System.out.println("The sum of " +num1+ " natural numbers is" + (num1*(num1+1)/2));
			}
		}
	}
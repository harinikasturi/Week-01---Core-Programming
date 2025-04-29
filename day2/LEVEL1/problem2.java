import java.util.*;
	class Problem2{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the numbers");
			int num1=sn.nextInt();
			int num2=sn.nextInt();
			int num3=sn.nextInt();
			System.out.println("Is the first number the smallest? " +((num1<num2)&&(num1<num3)));
		}
	}
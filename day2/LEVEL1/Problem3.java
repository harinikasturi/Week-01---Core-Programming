import java.util.*;
	class Problem3{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the numbers");
			int num1=sn.nextInt();
			int num2=sn.nextInt();
			int num3=sn.nextInt();
			System.out.println("Is the first number the largest? " +((num1>num2)&&(num1>num3)));
			System.out.println("Is the second number the largest? " +((num2>num1)&&(num2>num3)));
			System.out.println("Is the third number the largest? " +((num3>num2)&&(num3>num1)));
	}
}
			
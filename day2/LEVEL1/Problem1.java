import java.util.*;
	class Problem1{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the number");
			int number=sn.nextInt();
			System.out.println("Is the number " + number+ " divisible by 5?  "+(number%5==0));
		}
	}
import java.util.*;
	class Problem15{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the number");
			int number=sn.nextInt();
			int fact =1;
			if (number>0){
			int i =1;
			for(i=1;i<=number;i++){
			fact=i*fact;
			}
		}System.out.println("Factorial of number is" +fact);
		}
	}
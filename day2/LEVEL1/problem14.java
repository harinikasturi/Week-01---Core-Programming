import java.util.*;
	class Problem14{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the number");
			int number=sn.nextInt();
			int fact =1;
			if (number>0){
			int i =1;
			while(i<=number){
			fact=i*fact;
			i++;
			}
		}System.out.println("Factorial of number is" +fact);
		}
	}
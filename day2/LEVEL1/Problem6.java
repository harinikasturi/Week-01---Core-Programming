import java.util.*;
	class Problem6{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sn.nextInt();
			if (num>0){
			System.out.println("Number is positive");
			} else if (num==0){
			System.out.println("Number is zero");
			} else{
			System.out.println("Number is negative");
			}
		}
	}
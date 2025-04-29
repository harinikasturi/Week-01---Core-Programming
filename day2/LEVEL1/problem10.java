import java.util.*;
	class Problem10{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			double total=0.0;
			System.out.println("Enter the number");	
			double num=sn.nextDouble();
			while(num>0){
			total=total+num;
			System.out.println("Enter the next number");
			num=sn.nextDouble();
			}System.out.println("the total value is" +total);
		}
	}
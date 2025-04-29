import java.util.*;
	class Problem11{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			double total=0.0;
			System.out.println("Enter the number");	
			double num=sn.nextDouble();
			while(true){
			if (num<=0)
			break;
			total=total+num;
			System.out.println("Enter the next number");
			num=sn.nextDouble();
			}System.out.println("the total value is" +total);
		}
	}
import java.util.*;
	class problem9{
		public static void main(String[] args){
		System.out.println("Enter the value of fees:");
		Scanner sn=new Scanner(System.in);
		int fee=sn.nextInt();
		System.out.println("Enter the value of discount:");
		int discountPercent=sn.nextInt();
		double discountamount=((double)discountPercent/100)*fee;
		double finalfee=fee-discountamount;
		System.out.println(" The discount amount is INR " +discountamount+ "and final discounted fee is INR " +finalfee);
		}
	}
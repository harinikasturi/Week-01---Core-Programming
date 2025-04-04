import java.util.*;
	class Discount{
		public static void main(String[] args){
		int fee=125000;
		int discountpercent=10;
		int discountamount=(fee/discountpercent)*100;
		int finalfee=fee-discountamount;
		System.out.println(" The discount amount is INR " +discountamount+ "and final discounted fee is INR " +finalfee);
		}
	}

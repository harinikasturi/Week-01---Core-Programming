import java.util.*;
	class Items{
		public static void main(String[] args){
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the Unit Price");
		int unitPrice=sn.nextInt();
		System.out.println("Enter the Quantity");
		int quantity=sn.nextInt();
		int totalPrice=unitPrice*quantity;
		System.out.println("The total purchase price is INR " +totalPrice+ " if the quantity " + quantity+ " and unit price is INR " +unitPrice);
	}
}
		
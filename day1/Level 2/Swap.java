import java.util.*;
	class Swap{
		public static void main(String[] args){
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sn.nextInt();
		int b=sn.nextInt();
		System.out.println("The original numbers are" +a+  " and " +b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("The swapped numbers are" +a+  " and " +b);
		}
}
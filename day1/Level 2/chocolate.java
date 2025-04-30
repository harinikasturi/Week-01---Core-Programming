import java.util.*;
	class Chocolates{
		public static void main(String[] args){
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int children=sn.nextInt();
		int chocolates=sn.nextInt();
		int eachstudent=chocolates/children;
		int remaining=chocolates%children;
		System.out.println("The number of chocolates each child gets is " + eachstudent + " and the number of remaining chocolates are " +remaining);
	}
}
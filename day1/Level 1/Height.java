import java.util.*;
	class Height{
		public static void main(String[] args){
		System.out.println("Enter your height in cm: ");
		Scanner sn=new Scanner(System.in);
		int height=sn.nextInt();
		double inch=(height/2.54);
		double foot=(inch/12);
		System.out.println("Your Height in cm is "+height+ " while in feet is " +foot+ " and inches is " +inch);
	}
}
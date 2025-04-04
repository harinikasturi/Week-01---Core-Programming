import java.util.*;
	class Park{
		public static void main(String[] args){
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int side1=sn.nextInt();
		int side2=sn.nextInt();
		int side3=sn.nextInt();
		int perimeter=side1+side2+side3;
		int distance=5000;
		int rounds=distance/perimeter;
		System.out.println("The total number of rounds the athlete will run is " + rounds + "  to complete 5 km ");
	}
}
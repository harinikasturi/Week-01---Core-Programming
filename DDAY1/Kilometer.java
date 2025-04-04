import java.util.*;
	class Kilometer{
		public static void main(String[] args){
			System.out.println("Enter the value");
			Scanner sn=new Scanner(System.in);
			double Kilometer=sn.nextDouble();
			double miles=Kilometer/1.6;
			System.out.println("The total miles is "+miles+"mile for the given"+Kilometer+"km");
	}
}

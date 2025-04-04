import java.util.*;
	class Yards{
		public static void main(String[] args){
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the distance in feet");
		double feets=sn.nextDouble();
		double yards=feets/3;
		double miles=yards/1760;
		System.out.println("The distance in yards is " +yards+ " while the distance in miles is " +miles);
		}
	}
		
		
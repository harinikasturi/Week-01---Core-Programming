import java.util.*;
	class Problem7{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the month");
			int month=sn.nextInt();
			System.out.println("Enter the date");
			int date=sn.nextInt();
			if ((month==3&&date>=20&&date<=31)||
				(month==4&&date>=1&&date<=31)||
				(month==5&&date>=1&&date<=31)||
				(month==6&&date>=1&&date<=20)){
				System.out.println("Its a Spring Season");
			}else {
				System.out.println("Not a Spring Season");
			}
		}
	}
			
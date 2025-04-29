import java.util.*;
	class Problem5{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the number");
			int age=sn.nextInt();
			if (age>18){
			System.out.println("The Person can vote");
			}else{
			System.out.println("The Person cannot vote");
			}
		}
	}
import java.util.*;
	class Problem16{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the number");
			int number=sn.nextInt();
			if (number>0){
			int i =1;
			for(i=1;i<=number;i++){
			if(i%2==0){
			System.out.println("The number is even " +i);
			}else{
			System.out.println("The number is odd " +i);
			
			}
		}
		}
	}
	}
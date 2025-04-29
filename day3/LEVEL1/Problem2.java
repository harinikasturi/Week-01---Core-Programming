import java.util.*;
	class Problem2{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the Numbers");
			int num[]= new int[5];
			for (int i=0; i<num.length;i++){
			num[i]=sn.nextInt();
			}
			for (int i =0;i<num.length;i++){
			if (num[i]>0&&num[i]%2==0){
				System.out.println("The number  " +num[i]+ " is positive and even");
			}else if (num[i]>0&&num[i]%2!=0){
				System.out.println("The number  " +num[i]+ " is positive and odd");
			}else if (num[i]==0){
				System.out.println("The number  " +num[i]+ " is zero");
			}else if(num[i]<0){
				System.out.println("The number  " +num[i]+ " is negative");
			}else {
				System.out.println("wrong input");
			}
			
		}
	}
}
			
			
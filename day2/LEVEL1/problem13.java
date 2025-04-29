import java.util.*;
	class Problem13{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			int sum=0,sum1=0;
			System.out.println("Enter the number");	
			int num=sn.nextInt();
			if (num>0){
			sum=num*(num+1)/2;
			System.out.println("Sum using formula"+sum);
			
			for(int i=0;i<=num;i++){
			sum1+=i;
			}
			System.out.println("Sum using while" +sum1);
			if(sum==sum1){
			System.out.println("Both the results are same");
			}else{
			System.out.println("Both are not same");
		}
		}
		}
}
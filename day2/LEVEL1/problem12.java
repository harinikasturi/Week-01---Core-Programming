import java.util.*;
	class Problem11{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			int sum=0,sum1=0;
			System.out.println("Enter the number");	
			int num=sn.nextInt();
			if (num>0){
			sum=num*(num+1)/2;
			System.out.println("Sum using formula"+sum);
			int i=0;
			while(i<=num){
			sum1+=i;
			i++;
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

			
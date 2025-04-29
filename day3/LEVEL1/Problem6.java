import java.util.*;
	class problem6{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the number");
			double num[]=new double[11];
			double sum=0.0;
			for (int i=0;i<11;i++){
			num[i]=sn.nextDouble();
	        sum+=num[i];
			}
			System.out.println("the mean height is: " + (sum/num.length));
			}
			}
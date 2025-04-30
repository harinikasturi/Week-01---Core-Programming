import java.util.*;
	public class program6{
		public static void main(String[] args){
			System.out.println("Enter the Principal Amount");
			Scanner sn=new Scanner(System.in);
			int principalAmount=sn.nextInt();
			System.out.println("Enter the Rate of interest");
			double rateofInterest=sn.nextDouble();
			System.out.println("Enter the Time");
			int time=sn.nextInt();
			double simpleInterest=(principalAmount*rateofInterest*time)/100;
			System.out.println("The Simple Interest: "+simpleInterest);
	}
}